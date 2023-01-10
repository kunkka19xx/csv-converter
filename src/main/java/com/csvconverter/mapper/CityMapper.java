package com.csvconverter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.csvconverter.model.City;
import com.csvconverter.model.CityOutCsv;

@Mapper
public interface CityMapper {

	List<City> selectAllCities();

	Integer insertcities(List<CityOutCsv> cities);
}
