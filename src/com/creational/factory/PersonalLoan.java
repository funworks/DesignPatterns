package com.creational.factory;

public class PersonalLoan implements Loan {

	@Override
	public float calculateInterestAmount(float amount) {
		return amount * 14.0f / 100;
	}

}
