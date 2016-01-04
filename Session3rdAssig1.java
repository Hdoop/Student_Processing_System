package com.assignment.example;

import java.io.IOException;
import java.lang.String;
import java.math.*;
import java.util.Scanner;
public class Session3rdAssig1 {

	public Session3rdAssig1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		Session3rdAssig1 obj =new Session3rdAssig1();
		System.out.println("Enter a number :");	
		
		 Scanner sc = new Scanner(System.in);
	     double number = sc.nextInt();
		
	     
		double sr =obj.SqRt(number);
		
		double cr= obj.CubeRt(number);
		System.out.printf("Squar Root Of %s Is : %s " ,new Object [] {number, sr});
		System.out.println();
		System.out.printf("Cube Root Of %s Is : %s " ,new Object [] {number, cr});
	}
	public double SquarRoot(double number){

		return Math.sqrt(number);
	}
	public  double CubeRoot(double number){
	
		return Math.cbrt(number);
	}
	public double SqRt(double number)
	{
		float pre = 0.01f;
	    double min = 0;
	    double max = number;
	    double result = 0;
	    while (max-min > pre)
	    {
	        result = (float)(min + max) / 2;
	        if ((result*result) >= number)
	        {
	           max = result;
	        }
	        else
	        {
	           min = result;
	        }
	   }
	   //System.out.println(result);
	   return result;
	}
	public double CubeRt(double number)
	{
		float pre = 0.00001f;
	    double min = 0;
	    double max = number;
	    double result = 0;
	    while (max-min > pre)
	    {
	        result = (float)(min + max) / 2;
	        //System.out.println(min);
	        //System.out.println(max);
	        //System.out.println((min + max) / 2);
	        
	        if ((result*result*result) >= number)
	        {
	           max = result;
	        }
	        else
	        {
	           min = result;
	        }
	        //System.out.println(result);
	   }
	   //System.out.println(result);
	   return result;
	}

}
