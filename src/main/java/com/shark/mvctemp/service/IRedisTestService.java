package com.shark.mvctemp.service;

public interface IRedisTestService {

	void set(String s,String m);
	
	String get(String s);

	void delete(String key);
}
