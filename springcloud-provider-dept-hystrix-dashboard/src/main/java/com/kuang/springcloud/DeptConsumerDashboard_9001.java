package com.kuang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 *
 *
 * @author 廖聪聪
 * @version 1.0
 * 创建时间 2020/10/7 13:36
 */
@SpringBootApplication
//开启监控
@EnableHystrixDashboard
public class DeptConsumerDashboard_9001 {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumerDashboard_9001.class,args);
	}
}
