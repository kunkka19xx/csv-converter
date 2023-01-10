package com.csvconverter.service;

import java.util.List;

import com.csvconverter.model.City;
import com.csvconverter.model.CityOutCsv;

public interface CityService {
	List<City> selectAllCities();
	
	Integer insertcities(List<CityOutCsv> cities);
}
