package com.kuang.springcloud.control;

import com.kuang.springcloud.pojo.Dept;
import com.kuang.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

/**
 *
 *
 * @author 廖聪聪
 * @version 1.0
 * 创建时间 2020/10/6 12:38
 */
@RestController
public class DeptConsumerControl {

/*	@Autowired
	private RestTemplate restTemplate;

	//private static final String REST_URL_PREFIX="http://localhost:8001";

	private static final String REST_URL_PREFIX="http://SPRINGCLOUD-PROVIDER-DEPT";*/
	@Autowired
	private DeptClientService service;

	@RequestMapping("/consoumer/dept/add")
	public boolean add(Dept dept){
	    return this.service.addDept(dept);
	}

	@RequestMapping("/consoumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id){
		return this.service.queryById(id);
	}

	@RequestMapping("/consoumer/dept/list")
	public List<Dept> list(){
		return this.service.queryAll();
	}
}
