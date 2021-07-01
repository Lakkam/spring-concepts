package com.lakkam.springdemo.insurance;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringInsuraceDemo {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		InsuranceLOB autoInsuranceBean = applicationContext.getBean("insuranceBean",InsuranceLOB.class);
	System.out.println("Getting Car Insurance Premium : "+autoInsuranceBean.calculatePremium());
		
		
		InsuranceLOB homeInsuranceBean = applicationContext.getBean("homeInsuranceBean",InsuranceLOB.class);
		System.out.println("Home Insurance Premium : "+homeInsuranceBean.calculatePremium());
		System.out.println("Credit Score for Home Insurance : "+homeInsuranceBean.findCreditScore());
				
		applicationContext.close();
	}

}
