package com.question2;

public class PermanentEmployee extends Employee {

	private double basicPay;
	
	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
	}

	public PermanentEmployee(int employeeId, String employeeName) {
		super(employeeId, employeeName);
		
	}

	@Override
	void calculateSalary() {
		double PF = basicPay * 0.12;
		double salary = basicPay - PF;
	    this.setSalary(salary);
	}

}
