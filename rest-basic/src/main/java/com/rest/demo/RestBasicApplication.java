package com.rest.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.rest" })
public class RestBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestBasicApplication.class, args);
	}

}
