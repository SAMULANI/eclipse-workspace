package com.capgemini.sfdc;

import java.util.Scanner;

public class AssignmentC11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of your choice:");
         int n= sc.nextInt();
         
         int i=1;
          for (i=1; i<=10;i++) {
        	  int table= n*i;
        	  System.out.println(table);
          }
	}

}
