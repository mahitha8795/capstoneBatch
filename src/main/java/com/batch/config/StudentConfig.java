package com.batch.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.batch.model.StudentDTO;

@Configuration
@EnableBatchProcessing
public class StudentConfig {
	
	@Autowired
	public JobBuilderFactory jobBuilderFactory;
	@Autowired
	public StepBuilderFactory stepBuilderFactory;
	@Autowired
	ItemReader<StudentDTO> streader;
	@Autowired
	ItemProcessor<StudentDTO,StudentDTO> stprocessor;
	@Autowired
	ItemWriter<StudentDTO> stwriter;

	
	@Bean
	public Job job(JobBuilderFactory jobBuilderFactory,StepBuilderFactory stepBuilderFactory){
		
		Step ststep=stepBuilderFactory.get("ETL-File-load")
					.<StudentDTO,StudentDTO>chunk(100)
					.reader(streader)
					.processor(stprocessor)
					.writer(stwriter)
					.build();
		
		return jobBuilderFactory.get("ETL-load")
				.incrementer(new RunIdIncrementer())
				.start(ststep)
				.build();
	}
 
}
