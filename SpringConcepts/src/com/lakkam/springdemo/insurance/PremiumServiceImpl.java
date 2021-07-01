package com.lakkam.springdemo.insurance;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PremiumServiceImpl implements PremiumService {
	
	private String carPremium;
	
	@Value("${homeInsurancePremium}")
	private String homeInsurancePremium;
	
	@Value("${defaultPremium}")
	private String defaultPremium;

	public PremiumServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	public String getCarPremium() {
		return carPremium;
	}


	public void setCarPremium(String carPremium) {
		this.carPremium = carPremium;
	}


	@Override
	public String findPremium(String insuranceType) {
		if(insuranceType.equalsIgnoreCase("carInsurance")) {
		return carPremium;
		}
		if(insuranceType.equalsIgnoreCase("homeInsurance")) {
			return homeInsurancePremium;
			}
		return defaultPremium;
	}

}
