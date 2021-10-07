package com.contactservice.contact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ContactApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactApplication.class, args);
	}

}
