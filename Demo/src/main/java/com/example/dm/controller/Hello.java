package com.example.dm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	@GetMapping("/test")
    public String display(){
        return "HelloWorld";
    }

}
