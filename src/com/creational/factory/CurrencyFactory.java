package com.creational.factory;

public class CurrencyFactory {
	
	public static Currency createCurrency(String country) {
		if (country.equalsIgnoreCase("India")) {
			return new IndianRupee();
		} else if (country.equalsIgnoreCase("USA")) {
			return new AmericanDollar();
		} else if (country.equalsIgnoreCase("Europe")) {
			return new Euro();
		}
		throw new IllegalArgumentException("Invalid country");
	}
	
	public static void main(String[] args) {
		String country = args[0];
		Currency currency = CurrencyFactory.createCurrency(country);
		System.out.println("ISO code for " + country + " is " + currency.getIsoCode());
	}

}