package com.mayuratech.customermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication

//Enabled the swagger here
@EnableSwagger2

//class which controls the whole spring project or application
public class CustomermanagementApplication {

	//main method is declared here for executing 
	public static void main(String[] args) {
		SpringApplication.run(CustomermanagementApplication.class, args);
	}
}
