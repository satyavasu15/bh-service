package com.satya.bhservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.satya.bhservice.controller")
@EntityScan(basePackages = "com.satya.bhservice.model")
@EnableJpaRepositories(basePackages = { "com.satya.bhservice.repository"})
public class BhserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BhserviceApplication.class, args);
	}

}
