package com.bridgelabz.emp;

public class EmpWageBuilder {
	
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	private static String company;
	private static int empRatePerHour;
	private static int numOfWorkingDays;
	private static int maxHoursInMonth ;
	
	EmpWageBuilder(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth){
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursInMonth = maxHoursInMonth;
	}
	
	public  void computeEmpWage() {

		//variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays =0;
		//compuation
		while(totalEmpHrs <= maxHoursInMonth && totalWorkingDays < numOfWorkingDays) {
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
		int totalWage = totalEmpHrs *empRatePerHour;
		System.out.println("The total wage of employee in "+company+" is : "+ totalWage);
	}
	
	public static void main(String[] args) {
		EmpWageBuilder dMart = new EmpWageBuilder("Dmart",20, 5, 50);
		dMart.computeEmpWage();
		
		EmpWageBuilder Reliance = new EmpWageBuilder("Reliance",22, 6, 60);
		Reliance.computeEmpWage();
		
	}

}
