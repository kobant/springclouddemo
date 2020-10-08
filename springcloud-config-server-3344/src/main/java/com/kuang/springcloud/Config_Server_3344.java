package com.kuang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * /**
 *
 * @author 廖聪聪
 * @version 1.0
 * 创建时间 2020/10/7 17:20
 */
@SpringBootApplication
@EnableConfigServer
public class Config_Server_3344 {
	public static void main(String[] args) {
		SpringApplication.run(Config_Server_3344.class,args);
	}
}
