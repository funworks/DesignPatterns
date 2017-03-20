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

	public static void main(String[] args) {
		String loanType;
		
		loanType = "home";
		Loan loan = LoanFactory.createLoan(loanType);
		System.out.println("Home Loan interest = " + loan.calculateInterestAmount(1000));
		
		loanType = "education";
		loan = LoanFactory.createLoan(loanType);
		System.out.println("Education Loan interest = " + loan.calculateInterestAmount(1000));
		
		loanType = "personal";
		loan = LoanFactory.createLoan(loanType);
		System.out.println("Personal Loan interest = " + loan.calculateInterestAmount(1000));
	}

}
