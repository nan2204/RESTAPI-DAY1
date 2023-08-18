package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex2 {
	private String name="IamNeo";
	@GetMapping("/")
    public String display() {
    	return "Welcome "+name+" !";
    }
}
