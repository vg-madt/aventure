package com.aventure.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories
@ComponentScan("com.aventure")
@EnableTransactionManagement

public class AventureApplication {

	public static void main(String[] args) {
		SpringApplication.run(AventureApplication.class, args);
		

	}

}
