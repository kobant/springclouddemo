package com.kuang.springcloud.control;

import com.kuang.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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

	@Autowired
	private RestTemplate restTemplate;

	//private static final String REST_URL_PREFIX="http://localhost:8001";

	private static final String REST_URL_PREFIX="http://SPRINGCLOUD-PROVIDER-DEPT";

	@RequestMapping("/consoumer/dept/add")
	public boolean add(Dept dept){
		return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
	}

	@RequestMapping("/consoumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id){
		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
	}

	@RequestMapping("/consoumer/dept/list")
	public List<Dept> list(){
		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
	}
}
