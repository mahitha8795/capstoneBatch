package com.batch.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.support.rowset.RowSet;
import org.springframework.stereotype.Component;

import com.batch.model.StudentDTO;

@Component
public class StudentMapper implements RowMapper<StudentDTO> {
 
	List<StudentDTO> list = new ArrayList<StudentDTO>();
	@Override
	public StudentDTO mapRow(RowSet rs) throws Exception {
		StudentDTO st = new StudentDTO();
		st.setName(rs.getColumnValue(0));
		st.setEmailAddress(rs.getColumnValue(1));
		st.setPurchasedPackage(rs.getColumnValue(2));
		list.add(st);
		return st;
	}

}
