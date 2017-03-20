package com.creational.factory;

public class HomeLoan implements Loan {
	
	@Override
	public float calculateInterestAmount(float amount) {
		return amount * 8.5f / 100;
	}

}
