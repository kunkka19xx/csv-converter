package com.csvconverter.task;

import java.util.List;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csvconverter.constants.ConfigConstants;
import com.csvconverter.model.CityOutCsv;
import com.csvconverter.service.CityService;
import com.csvconverter.service.impl.CsvService;
import com.csvconverter.utils.PropertyUtils;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class InsertCitiesTask implements Tasklet {
	@Autowired
	private CityService cityService;

	@Autowired
	private CsvService csvService;
	
	/**
	 * just a sample, in processing with n (big number of) records,
	 * should use chunk oriented step (csv read & write tasks are same)
	 */
	
	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		List<CityOutCsv> cities = csvService.bindToNewObject(PropertyUtils.loadConfig(ConfigConstants.CSV_INPUT_PATH));
		log.info("Insert Cities Task's starting!");
		cityService.insertcities(cities);
		log.info("Insert Cities Task's ended!");
		return RepeatStatus.FINISHED;
	}
}
