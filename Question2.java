package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Question2 {

	@Value("${var}")
	private String studentName;
	
	@GetMapping("/run")
	public String display()
	{
		return "Welcome "+studentName+" !";
	}
}
