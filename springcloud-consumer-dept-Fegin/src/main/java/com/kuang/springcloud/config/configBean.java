package com.kuang.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * /**
 *
 * @author 廖聪聪
 * @version 1.0
 * 创建时间 2020/10/6 12:42
 */

@Configuration
public class configBean {

	@Bean
	@LoadBalanced//配置负载均衡
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}




}
