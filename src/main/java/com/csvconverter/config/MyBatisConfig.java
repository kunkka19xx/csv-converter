package com.csvconverter.config;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Properties;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.csvconverter.constants.ConfigConstants;
import com.csvconverter.utils.PropertyUtils;

@Configuration
public class MyBatisConfig {

	@Bean
	DriverManagerDataSource dataSource() throws IOException {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		Properties properties = new Properties();
		InputStream config = PropertyUtils.class.getClassLoader().getResourceAsStream(ConfigConstants.APPLICATION_PROP);
		properties.load(config);
		dataSource.setUrl(properties.getProperty("spring.datasource.url"));
		dataSource.setUsername(properties.getProperty("spring.datasource.username"));
		dataSource.setPassword(properties.getProperty("spring.datasource.password"));
		return dataSource;
	}

	@Bean
	SqlSessionFactoryBean sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		System.out.println("Server IP: " + InetAddress.getLocalHost().getHostAddress());
		System.out.println("Server Name:  " + InetAddress.getLocalHost().getHostName());

		sqlSessionFactory.setDataSource(dataSource());
		return sqlSessionFactory;
	}
}