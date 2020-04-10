package com.details.detailsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DetailsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DetailsServiceApplication.class, args);
	}

}
