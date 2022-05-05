package com.spring.restapi;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.spring.restapi.services.LoginDB;

@SpringBootApplication
@ComponentScan(basePackages={"com.spring.restapi", "com.spring.restapi.controller", "com.spring.restapi.model", "com.spring.restapi.repository", "com.spring.restapi.services"})
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
