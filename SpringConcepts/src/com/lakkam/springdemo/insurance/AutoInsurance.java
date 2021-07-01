package com.lakkam.springdemo.insurance;

import org.springframework.beans.factory.annotation.Autowired;

public class AutoInsurance implements InsuranceLOB {

	@Autowired
	PremiumService myPremiumService;

	@Override
	public String calculatePremium() {

		return myPremiumService.findPremium("carInsurance");
	}

	@Override
	public String findCreditScore() {
		// TODO Auto-generated method stub
		return "";
	}

}
