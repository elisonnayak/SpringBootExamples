package com.example.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
public class BootrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootrestApplication.class, args);
	}

}
