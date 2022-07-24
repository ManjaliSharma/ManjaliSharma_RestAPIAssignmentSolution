package com.gl.fsd.employeemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class EmployeeManagementSpringBoot1Application {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSpringBoot1Application.class, args);
		System.out.println("I have started for you");
	}

}
