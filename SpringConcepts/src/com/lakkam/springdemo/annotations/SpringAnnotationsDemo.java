package com.lakkam.springdemo.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotationsDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringApplicationContext.class);
		Insurance lifeInsurance = applicationContext.getBean("lifeInsurance",Insurance.class);
		System.out.println("Life Insurance Premium : "+lifeInsurance.getLifeInsurancePremium());
	}

}
