package com.kuang.springcloud.control;

import com.kuang.springcloud.Service.DeptService;
import com.kuang.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * /**
 *
 * @author 廖聪聪
 * @version 1.0
 * 创建时间 2020/10/5 23:30
 */

@RestController
public class DeptControl {
	@Autowired
	private DeptService deptService;

	//获取一些配置信息，得到·具体的微服务·
	@Autowired
	private DiscoveryClient client;

	@PostMapping("/dept/add")
	public boolean addDept(Dept dept){
		return deptService.addDept(dept);
	}

	@GetMapping("/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id){
		return deptService.queryById(id);
	}

	@GetMapping("/dept/list")
	public List<Dept> queryall(){
		return deptService.queryAll();
	}

	@GetMapping("/dept/discovery")
	//注册进来的微服务，获取一些消息
	public Object discovery(){
		//获取微服务列表清单
		List<String> services = client.getServices();
		System.out.println("discovery==>services"+services);

		//得到一个具体的微服务信息，通过具体的微服务id  applicationinName
		List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
		for (ServiceInstance instance : instances) {
			System.out.println(

					instance.getHost()+"\t"+
					instance.getPort()+"\t"+
					instance.getUri()+"\t"+
					instance.getServiceId()
			);
		}
		return this.client;
	}
}
