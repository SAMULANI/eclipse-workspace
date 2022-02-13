package com.capgemini.sfdc.day2;

public class CalcDemo {
	public static void printNum() { 
		System.out.println("10");
	}
	public static void printSum(int a, int b) { 
		System.out.println(a + b);
	}
	public static int returnNum() { 
		int c=10;
		
		return   c;
	}
	public static int returnSum(int e, int f) { 
		
		return e +f;
	}
	  
	
//		
	 public static void main(String[] args) {
		 printNum();	
		printSum(5,6);
		int output= returnNum();
		System.out.println(output);
		int output2 = returnSum(15,16); 
		System.out.println(output2);

	}
}
