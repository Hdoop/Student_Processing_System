package com.assignment.example;

import java.io.IOException;
import java.util.Scanner;

public class Session2ndAssig1 {

	public Session2ndAssig1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Voteeligibility();
	}
	/**
	 * Assignment – Write a Java program to check whether you are
	eligible for vote or not?
	 * @throws Exception
	 */
	public static void Voteeligibility() throws IOException {
		// TODO Auto-generated constructor stub
		System.out.println("Please Enter Your Age :");	
		
		 Scanner sc = new Scanner(System.in);
	     int age = sc.nextInt();
		
		if(age >=18)
		{
			System.out.println("You are eligible to vote");		
			
		}
		else
		{		
			System.out.println("You are not eligible to vote");		
		}
	}
}
