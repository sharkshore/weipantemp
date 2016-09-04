package com.shark.mvctemp.service;

import java.util.List;
import java.util.Map;

import com.shark.mvctemp.dto.Student;

public interface IMongoTestService {
	
	void update(Student student);
	
	void delete();

	void insert(Student studentO);

	List getList(Map map);
}
