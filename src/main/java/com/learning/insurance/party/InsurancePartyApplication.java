package com.learning.insurance.party;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class InsurancePartyApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsurancePartyApplication.class, args);
	}

}
