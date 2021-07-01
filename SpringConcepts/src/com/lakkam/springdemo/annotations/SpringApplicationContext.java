package com.lakkam.springdemo.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.lakkam.springdemo.annotations")
@PropertySource("classpath:PremiumValues.properties")
public class SpringApplicationContext {
	
	/*
	 * 
	 * @Bean public PremiumService premiumService() { return new
	 * PremiumServiceImpl(); }
	 * 
	 * @Bean public Insurance lifeInsurance() { return new
	 * LifeInsurance(premiumService()); }
	 */

}
