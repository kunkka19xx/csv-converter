package com.csvconverter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.csvconverter.mapper")
@EnableBatchProcessing
@ComponentScan({"com.csvconverter.config", "com.csvconverter.service", "com.csvconverter.listener", "com.csvconverter.task"})
public class CsvConverterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsvConverterApplication.class, args);
	}

}
