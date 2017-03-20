package com.creational.factory;

public class LoanFactory {
	
	public static Loan createLoan(String loanType) {
		if (loanType.equalsIgnoreCase("home")) {
			return new HomeLoan();
		} else if (loanType.equalsIgnoreCase("education")) {
			return new EducationLoan();
		} else if (loanType.equalsIgnoreCase("personal")) {
			return new PersonalLoan();
		}
		throw new IllegalArgumentException();
	}

}