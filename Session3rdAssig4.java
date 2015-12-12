package com.assignment.example;

import java.util.Scanner;

public class Session3rdAssig4 {

	public Session3rdAssig4() {
		//
	}
	public static void main(String[] args) //throws IOException {
	{	

		Session3rdAssig4 obj =new Session3rdAssig4();
		System.out.println("Enter first number :");	
		
		 Scanner sc = new Scanner(System.in);
		
	     double number1 = sc.nextDouble();
	     System.out.println("Enter second number :");	
	     double number2 = sc.nextDouble();
	    
	    
	     System.out.println("Enter Operator :");
	     String opr = sc.next();
	     double returnstr =obj.Calculate(number1,number2,opr);
	     System.out.println("Result Is :"+returnstr);
	    
	     
	}
	public double Calculate(double number1 ,double number2 ,String opr)
	{
		double result=0;
		switch(opr)
		{	
			case "*":
				result= number1*number2;
			break;
			case "+":
				result= number1+number2;
			break;
			case "/":
				result= number1/number2;
			break;
			case "-":
				result= number1-number2;
			break;
		}
		return result;
			
	}
}
