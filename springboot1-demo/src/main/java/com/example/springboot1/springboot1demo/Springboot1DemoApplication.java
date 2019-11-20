package com.example.springboot1.springboot1demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springboot1DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Springboot1DemoApplication.class, args);
		String [] beanName = ctx.getBeanDefinitionNames();
		Arrays.sort(beanName);
		for (String bean : beanName) {
			//System.out.println("Bean Name :-"+ bean );
		}
	}

}
