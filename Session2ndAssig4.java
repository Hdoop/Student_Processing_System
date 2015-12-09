//package com.assignment.example;

import java.util.Scanner;

public class Session2ndAssig4 {

	public Session2ndAssig4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please Enter Month To Find Days. :");
		 Scanner sc = new Scanner(System.in);
	     int month = sc.nextInt();
			     
		DaysInMonth(month);
	}
	public static void DaysInMonth(int Month)
	{
		System.out.println("No of days in given month");
		switch(Month)
		{
		case 1:
			System.out.println("31 Days");			
			break;
		case 2:
			System.out.println("28/29 Days");			
			break;
		
		case 3:
			System.out.println("31 Days");			
			break;
		
		case 4:
			System.out.println("30 Days");			
			break;
		
		case 5:
			System.out.println("31 Days");			
			break;
		
		case 6:
			System.out.println("30 Days");			
			break;
		
		case 7:
			System.out.println("31 Days");			
			break;
		
		case 8:
			System.out.println("31 Days");			
			break;
		
		case 9:
			System.out.println("30 Days");			
			break;
		
		case 10:
			System.out.println("31 Days");			
			break;
		
		case 11:
			System.out.println("30 Days");			
			break;
		
		case 12:
			System.out.println("31 Days");			
			break;
			
		}
	}
}
