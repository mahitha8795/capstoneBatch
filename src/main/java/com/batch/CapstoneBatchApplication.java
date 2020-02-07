package com.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Scheduled;


@SpringBootApplication
//@EnableBatchProcessing
public class CapstoneBatchApplication {
	
	@Autowired
	JobLauncher joblauncher;
	
	@Autowired
	Job job;
	


	public static void main(String[] args) {
		SpringApplication.run(CapstoneBatchApplication.class, args);
	
	}
		@Scheduled(cron = "0 */1 * * * ?")
		public void perform() throws Exception{
			JobParameters params = new JobParametersBuilder()
										.addString("JobID",String.valueOf(System.currentTimeMillis()))
										.toJobParameters();
			joblauncher.run(job,params);
										
		
	}
	
	

}
