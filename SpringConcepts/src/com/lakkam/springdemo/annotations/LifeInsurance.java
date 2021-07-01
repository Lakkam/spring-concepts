package com.lakkam.springdemo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class LifeInsurance implements Insurance{
	
	@Autowired
	PremiumService premiumService;

	/*
	 * public LifeInsurance(PremiumService myPremiumService) { premiumService =
	 * myPremiumService; }
	 */
	public String getLifeInsurancePremium() {
		return premiumService.calculatePremium();
	}

}
