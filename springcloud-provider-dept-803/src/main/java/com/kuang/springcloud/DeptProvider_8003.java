package com.kuang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 *
 * @author 廖聪聪
 * @version 1.0
 * 创建时间 2020/10/5 23:36
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient//服务发现
public class DeptProvider_8003 {
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider_8003.class,args);
	}
}
