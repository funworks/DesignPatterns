package com.creational.factory;

public class Main {

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
