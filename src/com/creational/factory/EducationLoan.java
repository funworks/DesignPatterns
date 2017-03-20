package com.creational.factory;

public class EducationLoan implements Loan {
	
	@Override
	public float calculateInterestAmount(float amount) {
		return amount * 10.25f / 100;
	}

}
