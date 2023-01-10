package com.csvconverter.listener;

import java.util.List;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class StepListener implements StepExecutionListener {

	@Override
	public void beforeStep(StepExecution stepExecution) {
		log.info("Before Step: {}", stepExecution.getStepName());
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		List<Throwable> exceptions = stepExecution.getFailureExceptions();
		log.info("After Step: {}", stepExecution.getStepName());
		if (exceptions.isEmpty()) {
			return ExitStatus.COMPLETED;
		}
		log.info("This step has occurred some exceptions as follow. " + "[step-name:{}] [size:{}]",
				stepExecution.getStepName(), exceptions.size());
		exceptions.forEach(throwAble -> log.error("exception has occurred in job.", throwAble));
		return ExitStatus.FAILED;
	}

}
