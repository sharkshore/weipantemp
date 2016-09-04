package com.shark.mvctemp.dao;

import java.util.List;

import com.shark.mvctemp.common.exception.DaoException;
import com.shark.mvctemp.dto.Test;

public interface ITestDao {
	
	List getList();
	
	void insert(Test test) throws DaoException;
	
	void update(Test test)throws DaoException;
	
	void delete(int id)throws DaoException;
	
}
