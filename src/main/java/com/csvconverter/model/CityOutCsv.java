package com.csvconverter.model;

import com.opencsv.bean.CsvBindByName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CityOutCsv {
	@CsvBindByName(column = "LonS")
	private String lonS;
	@CsvBindByName(column = "EW")
	private String eW;
	@CsvBindByName(column = "City")
	private String city;
	@CsvBindByName(column = "State")
	private String state;
}
