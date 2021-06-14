package com.learning.insurance.party;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//@EnableEurekaClient
@SpringBootApplication
public class InsurancePartyApplication implements ApplicationRunner {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(InsurancePartyApplication.class);
	
	@Value("${spring.cloud.client.hostname:LOCALHOST}")
	private String applicationHost;
	
	@Value("${spring.application.name}")
	private String applicationName;
	
	@Value("${spring.application.instance_id:NO_INSTANCE}")
	private String applicationInstanceId;
	
	@Value("${server.port}")
	private String serverPort;

	public static void main(String[] args) {
		SpringApplication.run(InsurancePartyApplication.class, args);
	}
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		LOGGER.info("Application Host : {}",applicationHost);
		LOGGER.info("Application Name : {}",applicationName);
		LOGGER.info("Application Instance ID : {}",applicationInstanceId);
		LOGGER.info("Application Port : {}",serverPort);
		
	}

}
