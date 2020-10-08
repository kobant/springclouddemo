package com.kuang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 *
 *
 * @author 廖聪聪
 * @version 1.0
 * 创建时间 2020/10/7 15:58
 */

@SpringBootApplication
@EnableZuulProxy//网关代理
public class ZuulApplication_9527 {
	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication_9527.class,args);
	}
}
