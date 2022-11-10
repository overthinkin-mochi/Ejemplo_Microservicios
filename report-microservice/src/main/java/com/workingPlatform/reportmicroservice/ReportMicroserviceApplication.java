package com.workingPlatform.reportmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ReportMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReportMicroserviceApplication.class, args);
	}

}
