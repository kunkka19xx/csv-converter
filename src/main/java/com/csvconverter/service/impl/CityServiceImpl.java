package com.csvconverter.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csvconverter.mapper.CityMapper;
import com.csvconverter.model.City;
import com.csvconverter.model.CityOutCsv;
import com.csvconverter.service.CityService;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityMapper cityMapper;

	@Override
	public List<City> selectAllCities() {
		return cityMapper.selectAllCities();
	}

	@Override
	public Integer insertcities(List<CityOutCsv> cities) {
		return cityMapper.insertcities(cities);
	}

}
