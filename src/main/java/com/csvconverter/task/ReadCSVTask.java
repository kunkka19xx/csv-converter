package com.csvconverter.task;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csvconverter.constants.ConfigConstants;
import com.csvconverter.service.impl.CsvService;
import com.csvconverter.utils.PropertyUtils;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ReadCSVTask implements Tasklet {

	@Autowired
	private CsvService csvService;

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		log.info("ReadCSV task's Starting");
		csvService.readThenParse(PropertyUtils.loadConfig(ConfigConstants.CSV_INPUT_PATH));
		log.info("ReadCSV task's ended");
		return RepeatStatus.FINISHED;
	}

}
