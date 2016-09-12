package com.shark.mvctemp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shark.mvctemp.common.webcode.AJAXResult;
import com.shark.mvctemp.dto.TestMybatis;
import com.shark.mvctemp.dto.TestMybatisExample;
import com.shark.mvctemp.service.ITestMyBatisService;

/**控制器
 * 
 * @author TUZE808
 *
 */
@Controller
public class TestMyBatisController {
	
	//创建SLF4J对象
	private static final Logger logger = LoggerFactory.getLogger(TestMyBatisController.class);

	
	@Autowired
	ITestMyBatisService service;
	
	/** 测试接口 */
	@ResponseBody
	@RequestMapping("/mybatis/getList.do")
	public AJAXResult getList() {
		TestMybatisExample example=new TestMybatisExample();
		List list = service.selectByExample(example);
		AJAXResult result = AJAXResult.createSuccAjaxResult();
		result.setData(list);
		return result;
	}
	
	/** 测试接口 */
	@ResponseBody
	@RequestMapping("/mybatis/insert.do")
	public AJAXResult insert(TestMybatis t) {
		logger.info("--------name:--<<{}>>---------",t.getName());
		service.insert(t);
		return AJAXResult.createSuccAjaxResult();
	}
	
	
	/** 测试接口 */
	@ResponseBody
	@RequestMapping("/mybatis/update.do")
	public AJAXResult update(TestMybatis t) {
		service.updateByPrimaryKey(t);
		return AJAXResult.createSuccAjaxResult();
	}
	
	
	/** 测试接口 */
	@ResponseBody
	@RequestMapping("/mybatis/delete.do")
	public AJAXResult delete(int id) {
		service.deleteByPrimaryKey(id);
		return AJAXResult.createSuccAjaxResult();
	}
	


	


}

