package com.qa.springdemo;


import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.qa.springdemo.bean.Student;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);
		
		LocalTime timeNow = context.getBean("time", LocalTime.class);
		String greeting = context.getBean("greeting", String.class);
		String farewell = context.getBean("farewell", String.class);
		
		Student john = context.getBean("john", Student.class);
		Student jane = context.getBean("jane", Student.class);
		Student janeTwo = context.getBean("jane", Student.class);
		
		System.out.println(john);
		System.out.println(jane);
		System.out.println(janeTwo);
		System.out.println(jane == janeTwo);
		

	}
	

}
