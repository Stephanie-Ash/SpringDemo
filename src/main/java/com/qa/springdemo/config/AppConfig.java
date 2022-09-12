package com.qa.springdemo.config;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public LocalTime showTime() {
		return LocalTime.now();
	}

}
