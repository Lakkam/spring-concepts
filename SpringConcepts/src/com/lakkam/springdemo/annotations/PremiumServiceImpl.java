package com.lakkam.springdemo.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PremiumServiceImpl implements PremiumService {

	@Value("${lifeInsurancePremium}")
	private String lifeInsurancePremium;	
	@Override
	public String calculatePremium() {
		// TODO Auto-generated method stub
		return lifeInsurancePremium;

	}

}
