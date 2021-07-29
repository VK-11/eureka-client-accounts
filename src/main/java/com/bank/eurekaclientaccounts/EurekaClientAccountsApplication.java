package com.bank.eurekaclientaccounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClientAccountsApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello eureka-client-accounts-details";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientAccountsApplication.class, args);
	}

}
