package com.assignment.example;

import java.util.Scanner;

public class Session3rdAssig3 {

	public Session3rdAssig3() {
		//
	}
	public static void main(String[] args) //throws IOException {
	{	

		Session3rdAssig3 obj =new Session3rdAssig3();
		System.out.println("Enter a number :");	
		
		 Scanner sc = new Scanner(System.in);
	     int number = sc.nextInt();
	     String returnstr =obj.PrintRandonNos(number);
	     System.out.println(returnstr);
	     
	}
	public String PrintRandonNos(int input)
	{
		String str ="";
		for(int base=0;base<=input-1;base++)
		{
			str+=base+" ";
			
		}
		return str;
	}
}
