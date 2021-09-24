package com.example.rest; //base package

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // meta annotation
public class RestApplication {

	@Autowired
	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
		
	}
}
