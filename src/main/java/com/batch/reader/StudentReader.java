package com.batch.reader;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.excel.poi.PoiItemReader;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

import com.batch.mapper.StudentMapper;
import com.batch.model.StudentDTO;

@Component
public class StudentReader {
	
	@Bean
	ItemReader<StudentDTO> streader() throws MalformedURLException,FileNotFoundException{
		PoiItemReader<StudentDTO> reader = new PoiItemReader<>();
		reader.setLinesToSkip(1);
		reader.setResource(new FileSystemResource("D:\\Users\\852631\\StudentDTO.xlsx"));
		reader.setRowMapper(new StudentMapper());
		return reader;
		
	}

}
