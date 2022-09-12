package com.qa.springdemo;


import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);
		
		Object byName = context.getBean("showTime");
		LocalTime byType = context.getBean(LocalTime.class);
		LocalTime byBoth = context.getBean("showTime", LocalTime.class);
		
		System.out.println(byName);
		System.out.println(byType);
		System.out.println(byBoth);
	}
	

}
