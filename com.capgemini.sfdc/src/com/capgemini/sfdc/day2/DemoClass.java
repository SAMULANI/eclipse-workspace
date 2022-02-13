package com.capgemini.sfdc.day2;

class BankCustomer {
	static String ifsc;
	int acNo;
	String customerName;
	double balannce;
}

public class DemoClass {
	public static void main(String[] args) {
		BankCustomer.ifsc = "B54654NJ";
		System.out.println(BankCustomer.ifsc);
		BankCustomer obj= new BankCustomer();
		obj.acNo = 154645641;
		System.out.println(obj.acNo);

	}

}
