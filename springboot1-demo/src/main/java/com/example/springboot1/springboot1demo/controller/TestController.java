package com.example.springboot1.springboot1demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot1.springboot1demo.service.MyService;

@RestController
public class TestController {

	@Autowired
	MyService myService ;
	
	@GetMapping(path="/display")
	public String getMsg() {
		return myService.getMsg();
	}
}
