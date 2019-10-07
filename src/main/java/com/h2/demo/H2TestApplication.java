package com.h2.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@Configuration
public class H2TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2TestApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(H2Repository repo) {
		return args -> {
			repo.save(new Emp("Marudhu"));
			repo.save(new Emp("Gopi"));
		};
	}
}
