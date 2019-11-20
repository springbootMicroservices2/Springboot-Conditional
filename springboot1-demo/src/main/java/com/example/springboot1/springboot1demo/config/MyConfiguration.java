package com.example.springboot1.springboot1demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.example.springboot1.springboot1demo.condition.LinuxCondition;
import com.example.springboot1.springboot1demo.condition.WindowsCondition;
import com.example.springboot1.springboot1demo.service.MyService;

@Configuration
public class MyConfiguration {

	@Bean(name ="myService")
	@Conditional(WindowsCondition.class)
	public MyService myWinService() {
		return new MyService("I am from Windows");
	}
	

	@Bean(name ="myService")
	@Conditional(LinuxCondition.class)
	public MyService myLinuxService() {
		return new MyService("I am from Linux");
	}
}
