package com.lakkam.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach myBaseballCoach = appContext.getBean("myBaseballCoach",Coach.class);
		Coach myTrackCoach = appContext.getBean("myTrackCoach",Coach.class);
		System.out.println(myBaseballCoach.getDailyWorkout());
		System.out.println(myTrackCoach.getDailyWorkout());
		
		//Call dependencies through constructor dependency injection
		System.out.println(myTrackCoach.getDailyFortune());
		appContext.close();
	}

}
