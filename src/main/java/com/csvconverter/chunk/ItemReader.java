package com.csvconverter.chunk;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.batch.MyBatisCursorItemReader;
import org.mybatis.spring.batch.builder.MyBatisCursorItemReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.csvconverter.model.City;

public class ItemReader{

	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	@Bean
	MyBatisCursorItemReader<City> reader() {
		return new MyBatisCursorItemReaderBuilder<City>().sqlSessionFactory(sqlSessionFactory)
				.queryId("com.csvconverter.mapper.CityMapper.selectAllCities").build();
	}

}
