package com.csvconverter.service.impl;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Component;

import com.csvconverter.model.CityCsv;
import com.csvconverter.model.CityOutCsv;
import com.csvconverter.service.FileService;
import com.csvconverter.utils.CustomFileUtils;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

@Component
public class CsvService implements FileService {

	@Override
	public boolean isExist(String path) {
		return CustomFileUtils.isExist(path);
	}

	// CSV file line by line
	public static void readDataLineByLine(String file) throws IOException {
		CSVReader csvReader = null;
		try {
			// Create an object of filereader
			// class with CSV file as a parameter.
			FileReader filereader = new FileReader(file);

			// create csvReader object passing
			// file reader as a parameter
			csvReader = new CSVReader(filereader);
			String[] nextRecord;

			// we are going to read data line by line
			while ((nextRecord = csvReader.readNext()) != null) {
				for (String cell : nextRecord) {
					System.out.print(cell + "\t");
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (csvReader != null)
				csvReader.close();
		}
	}

	// all data at once
	public static void readAllDataAtOnce(String file) {
		try {
			// Create an object of file reader
			// class with CSV file as a parameter.
			FileReader filereader = new FileReader(file);

			// create csvReader object and skip first Line
			CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(1).build();
			List<String[]> allData = csvReader.readAll();

			// print Data
			for (String[] row : allData) {
				for (String cell : row) {
					System.out.print(cell + "\t");
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// all data at once and store into specified list object
	public List<CityCsv> readThenParse(String file) {
		List<CityCsv> target = new ArrayList<>();
		try (Reader reader = Files.newBufferedReader(Paths.get(file));) {
			CsvToBean<CityCsv> csvToBean = new CsvToBeanBuilder<CityCsv>(reader).withType(CityCsv.class)
					.withIgnoreLeadingWhiteSpace(true).build();
			target = csvToBean.parse();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return target;
	}

	// Edit data... but in this ex: just change object
	public List<CityOutCsv> bindToNewObject(String file) throws IllegalAccessException, InvocationTargetException {
		List<CityOutCsv> citiesOut = new ArrayList<>();
		List<CityCsv> cities = readThenParse(file);
		//edit data ...
		for (CityCsv cityCsv : cities) {
			CityOutCsv out = new CityOutCsv();
			BeanUtils.copyProperties(out,cityCsv);
			System.out.println(out.getCity());
			System.out.println(out.getEW());
			citiesOut.add(out);
		}
		return citiesOut;
	}

	// write
	public List<CityOutCsv> writeCSV(String inputPath, String outputPath)
			throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException, IllegalAccessException,
			InvocationTargetException {
		List<CityOutCsv> cities = bindToNewObject(inputPath);
		try (Writer writer = Files.newBufferedWriter(Paths.get(outputPath));) {
			StatefulBeanToCsv<CityOutCsv> beanToCsv = new StatefulBeanToCsvBuilder<CityOutCsv>(writer)
//					.withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
					.build();
			beanToCsv.write(cities);
		}
		return cities;
	}
}
