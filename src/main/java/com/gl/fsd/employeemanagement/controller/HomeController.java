package com.gl.fsd.employeemanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String handleHomePage() {
		return "Welcome to Employee Management";
	}

}
