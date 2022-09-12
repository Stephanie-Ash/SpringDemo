package com.qa.springdemo.config;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.qa.springdemo.bean.Student;

@Configuration
public class AppConfig {
	
	@Bean(name = "time")
	public LocalTime showTime() {
		return LocalTime.now();
	}
	
	@Bean(name = "greeting")
	public String greeting() {
		return "Hello, World";
	}
	
	@Bean(name = "farewell")
	@Scope("prototype")
	public String farewell() {
		return "Goodbye, World";
	}
	
	@Bean(name = "john", initMethod = "setup", destroyMethod = "closeDown")
	public Student getStudent() {
		return new Student(1, "John", "Smith", 18, "john@email.com", "Software Development", 15000.55);
	}
	
	@Bean(name = "jane")
	@Scope("prototype")
	public Student getStudent2() {
		return new Student(2, "Jane", "Doe", 21, "jane@email.com", "Software Development", 15006.55);
	}

}
