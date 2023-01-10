package com.csvconverter.config;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.csvconverter.constants.ConfigConstants;
import com.csvconverter.listener.StepListener;
import com.csvconverter.service.impl.CsvService;
import com.csvconverter.task.InsertCitiesTask;
import com.csvconverter.task.ReadCSVTask;
import com.csvconverter.task.WriteCSVTask;
import com.csvconverter.utils.PropertyUtils;

@Configuration
public class StepConfig {
	@Autowired
	private StepBuilderFactory stepBuilder;

	@Autowired
	private ReadCSVTask readCsvTask;

	@Autowired
	private WriteCSVTask writeCsvTask;

	@Autowired
	private StepListener stepListener;

	@Autowired
	private CsvService csvService;

	@Autowired
	private InsertCitiesTask insertCitiesTask;

	protected Step insertCities() {
		return stepBuilder.get("Insert Cities Data").tasklet(insertCitiesTask).build();
	}

	protected Step writeFile() {
		return stepBuilder.get("Write File").tasklet(writeCsvTask).build();
	}

	protected Step readFile() {
		return stepBuilder.get("Read File").tasklet(readCsvTask).build();
	}

	protected Step checkExistFile() {
		return stepBuilder.get("Check Exist File").tasklet(checkExistFileTask()).listener(stepListener).build();
	}

	private Tasklet checkExistFileTask() {
		return new Tasklet() {

			@Override
			public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
				if (csvService.isExist(PropertyUtils.loadConfig(ConfigConstants.CSV_INPUT_PATH))) {
					return RepeatStatus.FINISHED;
				} else {
					throw new Exception(PropertyUtils.loadMessage("MS0002"));
				}
			}
		};
	}

	protected Tasklet firstTask() {
		return new Tasklet() {

			@Override
			public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
				return RepeatStatus.FINISHED;
			}
		};
	}

	protected Tasklet secondTask() {
		return new Tasklet() {

			@Override
			public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
				return RepeatStatus.FINISHED;
			}
		};
	}
}
