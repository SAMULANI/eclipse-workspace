package Assignments;

import java.util.Scanner;

public class UserInputDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        
        System.out.println( num1 +num2);
	}

}