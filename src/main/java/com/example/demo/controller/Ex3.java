package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex3 {
    private String color="Green";
    @GetMapping("C")
    public String display()
    {
    	return "My Favourite Colour is "+ color;
    }
    		
}
