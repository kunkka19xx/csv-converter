package com.csvconverter.listener;

import java.util.List;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;

import com.csvconverter.utils.PropertyUtils;

import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
public class JobListener implements JobExecutionListener {
	@Override
	public void beforeJob(JobExecution jobExecution) {
		log.info(PropertyUtils.loadMessage("MS_INFO_0001"));
		log.info("Job Id: {}", jobExecution.getJobId());
		log.info("Job Param: {}", jobExecution.getJobParameters());
		log.info("Job Context: {}", jobExecution.getExecutionContext());
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		log.info("Job Id: {}", jobExecution.getJobId());
		List<Throwable> exceptions = jobExecution.getAllFailureExceptions();
		if (exceptions.isEmpty()) {
			return;
		}
		log.info("This job has occurred some exceptions as follow. " + "[job-name:{}] [size:{}]",
				jobExecution.getJobInstance().getJobName(), exceptions.size());
		exceptions.forEach(th -> log.error("exception has occurred in job.", th));

		jobExecution.getStepExecutions().forEach(stepExecution -> {
			Object errorItem = stepExecution.getExecutionContext().get("ERROR_ITEM");
			if (errorItem != null) {
				log.error("detected error on this item processing. " + "[step:{}] [item:{}]",
						stepExecution.getStepName(), errorItem);
			}
		});
		log.error("After Job");
	}

}
