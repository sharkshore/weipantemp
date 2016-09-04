package com.shark.mvctemp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shark.mvctemp.common.aop.InParam;
import com.shark.mvctemp.common.webcode.AJAXResult;
import com.shark.mvctemp.dto.Student;
import com.shark.mvctemp.service.IMongoTestService;

@Controller
public class MongoController {
	
	@Autowired
	IMongoTestService mongoService;
	
	@ResponseBody
	@RequestMapping("/mongo/insert.do")
	public AJAXResult insert(Student stu) {
		AJAXResult result = AJAXResult.createSuccAjaxResult();
		mongoService.insert(stu);
		return result;
	}

	@InParam(companyId=991)
	@ResponseBody
	@RequestMapping("/mongo/getList.do")
	public AJAXResult getList() {
		AJAXResult result = AJAXResult.createSuccAjaxResult();
		List list = mongoService.getList(null);
		result.setData(list);
		return result;
	}


}
