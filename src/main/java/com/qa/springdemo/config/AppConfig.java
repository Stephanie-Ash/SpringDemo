package com.qa.springdemo.config;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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

}
