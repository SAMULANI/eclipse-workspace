package Assignments;

import java.util.Scanner;

class Assignment1
{
public static void main(String args[]) 
	 {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the number of terms: ");
	  int n = sc.nextInt();
	  int s = 0, c;                       // s for terms of series, c for counter to generate n terms
	  for (c = 1; c <= n; c++) {
	   s = s * 10 + c;
	   System.out.println(s + " ");
	  }
	 }
	

}