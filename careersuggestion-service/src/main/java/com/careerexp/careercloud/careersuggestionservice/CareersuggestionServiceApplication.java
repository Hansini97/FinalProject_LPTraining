package com.careerexp.careercloud.careersuggestionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.careerexp.careercloud.commons.model.careersuggestion")
public class CareersuggestionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CareersuggestionServiceApplication.class, args);
	}

}
