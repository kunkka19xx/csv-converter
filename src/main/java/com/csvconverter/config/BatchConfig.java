package com.csvconverter.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.csvconverter.listener.JobListener;

@Configuration
public class BatchConfig {

	@Autowired
	private JobBuilderFactory jobBuilder;

	@Autowired
	private JobListener jobListener;

	@Autowired
	StepConfig stepConfig;

	@Bean
	Job firstJob() {
		return jobBuilder.get("First Job").incrementer(new RunIdIncrementer())
				.start(stepConfig.checkExistFile())
				.next(stepConfig.readFile())
				.next(stepConfig.writeFile())
				.next(stepConfig.insertCities())
				.listener(jobListener).build();
	}

}
