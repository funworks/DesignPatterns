package com.creational.factory;

public class Euro implements Currency {

	@Override
	public String getIsoCode() {
		return "EUR";
	}

}