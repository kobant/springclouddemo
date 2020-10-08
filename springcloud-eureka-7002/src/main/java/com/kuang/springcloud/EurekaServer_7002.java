package com.kuang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * /**
 *
 * @author 廖聪聪
 * @version 1.0
 * 创建时间 2020/10/6 15:08
 */
@SpringBootApplication
@EnableEurekaServer//服务端的启动类
public class EurekaServer_7002 {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer_7002.class,args);
	}
}
