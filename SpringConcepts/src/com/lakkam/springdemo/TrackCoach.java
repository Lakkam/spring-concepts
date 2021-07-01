package com.lakkam.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
 
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice daily 30 min running";
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Track Coach Fortune";
	}

}
