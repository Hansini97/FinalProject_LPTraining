package com.careerexp.careercloud.careerseekerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.careerexp.careercloud.commons.model.careerseeker")
public class CareerseekerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CareerseekerServiceApplication.class, args);
	}

}
