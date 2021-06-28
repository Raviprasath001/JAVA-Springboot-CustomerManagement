package com.mayuratech.customermanagement.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

//configuring the swagger class here
@Configuration
public class Swagger2Config {

	@SuppressWarnings("deprecation")
	@Bean

	// creating method to return all the documentation details
	public Docket swagerConfig() {

		// returning documentation details here
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("guru.springframework.controllers"))
				.paths(PathSelectors.ant("/shop/**")).build()
				.apiInfo(new ApiInfo("MayuraTech CustomerManagement",
						"Application which can able to perform Create, Read, Update and Delete operations", "1.0.0",
						"http://localhost:9090/mayuratechshop/", "MayuraTech Official", "@Copyrights", ""))
				.produces(Collections.singleton("application/json"))
				.consumes(Collections.singleton("application/json"));
	}
}
