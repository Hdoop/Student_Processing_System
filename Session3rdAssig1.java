package com.assignment.example;

import java.io.IOException;
import java.lang.String;
import java.math.*;
import java.util.Scanner;
public class Session3rdAssig1 {

	public Session3rdAssig1() {
		
	}

	public static void main(String[] args) throws IOException {
		Session3rdAssig1 obj =new Session3rdAssig1();
		System.out.println("Enter a number :");	
		
		 Scanner sc = new Scanner(System.in);
	     double number = sc.nextInt();
		
	     
		double sr =obj.SquarRoot(number);
		
		double cr= obj.CubeRoot(number);
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


}
