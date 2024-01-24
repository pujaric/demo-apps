package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;
import lombok.extern.log4j.Log4j;

@SpringBootApplication
@Log4j
public class DemoAppsApplication {

	public static void main(String[] args) {
//		logger.info("");
		SpringApplication.run(DemoAppsApplication.class, args);
	}

}
