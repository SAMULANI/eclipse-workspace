package com.capgemini.sfdc;

import java.util.Scanner;

public class AssignmentC3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ab= new Scanner(System.in);
		System.out.println("Enter the first number ");
		int n= ab.nextInt();
		Scanner ac= new Scanner(System.in);
		System.out.println("Enter the second number ");
		int m= ac.nextInt();

		int result = (n < m) ? n : m;
		System.out.println( result + " is a minimum value.");

	}

}
