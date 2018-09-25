package com.huc.boot_jwt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootJwtApplication {

	private static final Logger logger = LoggerFactory.getLogger(BootJwtApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BootJwtApplication.class, args);
		logger.info("发送服务启动 ");
	}
}
