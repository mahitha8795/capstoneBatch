package com.batch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.batch.model.StudentDTO;

@Component
public class StudentProcessor implements ItemProcessor<StudentDTO,StudentDTO>{

	@Override
	public StudentDTO process(StudentDTO st) throws Exception {
		return st;
	}

}
