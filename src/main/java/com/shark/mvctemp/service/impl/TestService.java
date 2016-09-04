package com.shark.mvctemp.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shark.mvctemp.common.exception.DaoException;
import com.shark.mvctemp.dao.ITestDao;
import com.shark.mvctemp.dto.Test;
import com.shark.mvctemp.service.ITestService;

@Service("testService")
public class TestService implements ITestService {
	
	//创建SLF4J对象
	private static final Logger logger = LoggerFactory.getLogger(TestService.class);


	@Autowired
	ITestDao dao;
	
	@Override
	public List getList() {
		return dao.getList();
	}

	@Override
	public void insert(Test test) {
		try {
			dao.insert(test);
		} catch (DaoException e) {
			logger.error(e.getMessage(),e);
		}

	}

	@Override
	public void update(Test test) {
		try {
			dao.update(test);
		} catch (DaoException e) {
			logger.error(e.getMessage(),e);
		}

	}

	@Override
	public void delete(int id) {
		try {
			dao.delete(id);
		} catch (DaoException e) {
			logger.error(e.getMessage(),e);
		}

	}

}
