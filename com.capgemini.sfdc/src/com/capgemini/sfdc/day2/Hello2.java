package com.capgemini.sfdc.day2;

public class Hello2 {
	public static void calculateSpeed(double distance, double time) {
		double speed= distance/time;
		System.out.println(distance);
		System.out.println(time);
		System.out.println(speed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double distance,time;
		
		distance= 200;
				time=20;
				System.out.println("The speed of car A is ");
				calculateSpeed(distance,time);
				

	}

}
