package com.question2;

public class Main {

	public static void main(String[] args) {
		
		Loan loan=Loan.getLoanObj();
		
		PermanentEmployee pe=new PermanentEmployee(101,"Abc",1300);
		double amt1=loan.calculateLoanAmount(pe);
		
		System.out.println(amt1);
		
		
		TemporaryEmployee te =new TemporaryEmployee(102,"Xyz",8,75);
		double amt2=loan.calculateLoanAmount(te);
		System.out.println(amt2);
		double amt3=loan.calculateLoanAmount(null);
		System.out.println(amt3);
	}

}
