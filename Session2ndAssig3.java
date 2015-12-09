package com.assignment.example;

public class Session2ndAssig3 {

	public Session2ndAssig3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern();
	}
	/**
	 * 	1
		12
		123
		1234
		12345
		1234
		123
		12
		1
	 */
	public static void Pattern()
	{
		int j=1;
		for(j =1;j<=5;j++)
		{
			for(int i =1;i<=j;i++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		for(int i =5;i>=1;i--)
		{
			for(j =1;j<=i-1;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
