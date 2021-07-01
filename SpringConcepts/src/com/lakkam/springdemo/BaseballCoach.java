package com.lakkam.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	

	public BaseballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice 30 min workout";
	}
	
	@Override
	public String getDailyFortune() {
		return "BaseballCoach fortune";
	}

}
