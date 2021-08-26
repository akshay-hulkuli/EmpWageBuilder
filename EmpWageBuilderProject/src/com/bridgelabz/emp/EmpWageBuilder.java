package com.bridgelabz.emp;

public class EmpWageBuilder {
	
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HOURS_IN_MONTH = 100;
	
	public static int computeEmpWage() {

		//variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays =0;
		//compuation
		while(totalEmpHrs <= MAX_HOURS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays ++;
			int empCheck = (int) Math.floor(Math.random()*10) % 3;
			switch (empCheck) {
				case IS_PART_TIME : 
					empHrs = 4;
					break;
				case IS_FULL_TIME :
					empHrs = 8;
					break;
				default :
					empHrs = 0;
			}
		
			totalEmpHrs += empHrs;
			System.out.println("Days#: "+totalWorkingDays+"     Emp Hrs: "+ empHrs);
		}
		int totalWage = totalEmpHrs *totalWorkingDays;
		return totalWage;
	}
	
	public static void main(String[] args) {
		int totalWage = computeEmpWage();
		System.out.println("Total Emp Wage: " + totalWage );
	}

}
