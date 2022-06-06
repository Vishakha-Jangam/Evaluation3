package com.question4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {

	public boolean Validate(String uname,String Pass,String mobile,String email) {
		
		
		boolean un=Pattern.matches("[a-zA-Z]{3,8}", uname);
		boolean pas=Pattern.matches("[a-zA-Z0-9]{3,8}", Pass);
		boolean mob=Pattern.matches("[6789]{1}[0-9]{9}", mobile);
		boolean em=Pattern.matches("[a-z][.]", email);
		
		if(un==true&&pas==true&&mob==true&&em==true) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Username:");
		String unm=sc.next();
		System.out.println("Eneter Password:");
		String pass=sc.next();
		System.out.println("Enter Mobile Number:");
		String mb=sc.next();
		System.out.println("Email:");
		String email=sc.next();
		Demo d=new Demo();
		boolean ans=d.Validate(unm, pass, mb, email);
		if(ans) {
			Customer c=new Customer();
			c.setEmail(email);
			c.setMobileNumber(mb);
			c.setPassword(pass);
			c.setUsername(unm);
			System.out.println("Username:"+c.getUsername());
			System.out.println("Password"+c.getPassword());
			System.out.println("Email:"+c.getEmail());
			System.out.println("Mobile:"+c.getMobileNumber());
			
		}else {
			System.out.println("Please Enter Valid Data:");
		}
		
		

	}

}
