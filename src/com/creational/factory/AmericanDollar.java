package com.creational.factory;

public class AmericanDollar implements Currency {

	@Override
	public String getIsoCode() {
		return "USD";
	}

}