package com.careerexp.careercloud.employerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.careerexp.careercloud.commons.model.employer")
public class EmployerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployerServiceApplication.class, args);
	}

}
