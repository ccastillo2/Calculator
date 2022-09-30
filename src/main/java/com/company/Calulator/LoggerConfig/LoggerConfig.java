package com.company.Calulator.LoggerConfig;

import io.corp.calculator.TracerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoggerConfig {

	@Bean
	public TracerImpl tracer() {
		return new TracerImpl();
	}
}
