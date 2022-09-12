package com.qa.springdemo;


import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);
		
		Object timeByName = context.getBean("time");
		LocalTime timeByType = context.getBean(LocalTime.class);
		LocalTime timeByBoth = context.getBean("time", LocalTime.class);
		
		String greeting = context.getBean("greeting", String.class);
		
		System.out.println(timeByName);
		System.out.println(timeByType);
		System.out.println(timeByBoth);
		System.out.println(greeting);

	}
	

}
