package com.userMng_Swagger;

//importing required packages and classes
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

//using annotation to configure security and swagger
@Configuration
@EnableSwagger2
@SpringBootApplication
public class UserMngSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserMngSwaggerApplication.class, args);
	}

}