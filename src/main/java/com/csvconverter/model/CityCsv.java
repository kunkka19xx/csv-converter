package com.csvconverter.model;

import com.opencsv.bean.CsvBindByName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CityCsv {
	@CsvBindByName(column = "LatD")
	private String latD;
	@CsvBindByName(column = "LatM")
	private String latM;
	@CsvBindByName(column = "NS")
	private String nS;
	@CsvBindByName(column = "LonD")
	private String lonD;
	@CsvBindByName(column = "LonM")
	private String lonM;
	@CsvBindByName(column = "LonS")
	private String lonS;
	@CsvBindByName(column = "EW")
	private String eW;
	@CsvBindByName(column = "City")
	private String city;
	@CsvBindByName(column = "State")
	private String state;

}
