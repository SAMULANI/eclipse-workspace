package com.capgemini.sfdc;

import java.util.Scanner;

public class AssignmentC15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	         System.out.println("Enter the number of your choice:");
	         int n= sc.nextInt();
	         int temp= 0;
	         int i;
	         for (i=2;i<n;i++) {
	        	 if (n%i==0) {
	        		 temp= temp + 1;
	        	 }
	         }
	         if (temp==0) {
	        	 System.out.println("Given number is  a prime number");
	         }
	         else {
	        	 System.out.println("Given number is not a prime number");
	         }
	}

}
