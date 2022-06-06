package com.question1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		
		Scanner sc =new Scanner(System.in);
		try {
		System.out.println("Enter the number of elements in the array:");
		int num=sc.nextInt();
		
		int arr[]=new int[num];
		System.out.println("Enter the elements in the array:");
		for(int i=0;i<num;i++) {
		 arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the index of the array element you want to access:");
		int ele=sc.nextInt();
		
		System.out.println(arr[ele]);
		System.out.println("The array element successfully accessed");
		}catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
		}catch(Exception na) {
			System.out.println(na);
		}
		
	}

}
