package com.lakkam.springdemo.insurance;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class CreditScoreServiceImple implements CreditScoreService {

	
	public CreditScoreServiceImple() {
		// TODO Auto-generated constructor stub
	}
	@Value("${homeInsuranceCreditScore}")
	private String creditScore;
	@Override
	public String findCreditScore() {
		// TODO Auto-generated method stub
		return creditScore;
	}

}
