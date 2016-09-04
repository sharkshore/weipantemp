package com.shark.mvctemp.service;

import java.util.List;

import com.shark.mvctemp.dto.Test;

public interface ITestService {

	List getList();
	
	void insert(Test test);
	
	void update(Test test);
	
	void delete(int id);
	
}
