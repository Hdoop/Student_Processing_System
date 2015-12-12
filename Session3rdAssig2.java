package com.assignment.example;

import java.util.Scanner;

public class Session3rdAssig2 {

	public Session3rdAssig2() {
		
	}

	public static void main(String[] args) {
		Session3rdAssig2 obj =new Session3rdAssig2();
		System.out.println("Enter a number :");	
		
		 Scanner sc = new Scanner(System.in);
	     int number = sc.nextInt();
		
		boolean bo =obj.IsNumberPrime(number);
		if(bo)
		{
			System.out.println("Number "+number+" Is Prime");
		}
		else
		{
			System.out.println("Number "+number+" Is Prime");
		}
	}
	public boolean IsNumberPrime(int number)
	{
		boolean isprime=true;
		for(int i =1;i<=number;i++)
		{
			//System.out.println(i);
			for(int j =i-1;j>1;j--)
			{
				if(i%j ==0)
				{	isprime=false;
					break;
				}
			}			
		}
		return isprime;
	}
}
