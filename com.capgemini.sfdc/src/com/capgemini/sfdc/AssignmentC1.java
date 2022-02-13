package com.capgemini.sfdc;

import java.util.Scanner;

public class AssignmentC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the first number");
		  int n = sc.nextInt();
			Scanner rc = new Scanner(System.in);
			  System.out.println("Enter the second number");
			  int m = rc.nextInt();
			  
      if(n>m) {
    	  System.out.println("The bigger number among these two is " + n);
      }
			  
      else {	  
		  System.out.println("The bigger number among these two is " + m);
	}

}
}
