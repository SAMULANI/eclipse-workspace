package Assignments;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,fact=1;
		System.out.println("Enter any number");
		Scanner r = new Scanner(System.in);
		n=r.nextInt();
		for (int i=1; i<=n; i++)
		{
			fact=fact*i;
		}
           System.out.println("factorial "+ fact);
	}

}
