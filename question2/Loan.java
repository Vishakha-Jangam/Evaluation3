package com.question2;

public class Loan {

	public double calculateLoanAmount(Employee employeeObj) {
		
		if (employeeObj instanceof PermanentEmployee) {
			 double sal=employeeObj.getSalary();
			 sal=sal*12;
			 double amt=(sal*15)/100;
			 return amt;
			
		}
		else if(employeeObj instanceof TemporaryEmployee) {
			double sal=employeeObj.getSalary();
			double amt=(sal*10)/100;
			 return amt;
		}
		return 0;
		
		
	}
	
	private Loan() {
		
	}
	public static Loan getLoanObj() {
		Loan loan=new Loan();
		return loan;
	}
}
