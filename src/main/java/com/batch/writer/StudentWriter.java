package com.batch.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import com.batch.model.StudentDTO;

@Component
public class StudentWriter implements ItemWriter<StudentDTO> {

	@Override
	public void write(List<? extends StudentDTO> stList) throws Exception {
		for(StudentDTO st:stList){
			System.out.println("student details :"+ st.getName());
		}
		
	}

}
