package com.bridgelabz.emp;

public class EmpWageBuilder {
	public static void main(String[] args) {
		//Constants
		int IS_FULL_TIME = 1;
		//compuation
		double empCheck = Math.floor(Math.random()*10) % 2;
		if( empCheck == IS_FULL_TIME) {
			System.out.println(" Employee is present");
		}
		else {
			System.out.println("Employee is absent");
		}
	}

}
