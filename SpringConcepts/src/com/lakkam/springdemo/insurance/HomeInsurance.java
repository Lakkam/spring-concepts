package com.lakkam.springdemo.insurance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomeInsurance implements InsuranceLOB {

	@Autowired
	PremiumService myPremiumService;
	
	@Autowired
	CreditScoreService myCreditScoreService;
	
	
	public HomeInsurance() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String calculatePremium() {
		// TODO Auto-generated method stub
		return myPremiumService.findPremium("homeInsurance");
	}
	
	@Override
	public String findCreditScore() {
		return myCreditScoreService.findCreditScore();
	}

}
