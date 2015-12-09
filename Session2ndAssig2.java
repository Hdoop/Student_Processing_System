package com.assignment.example;

public class Session2ndAssig2 {

	public Session2ndAssig2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumbers();
	}
	/**
	 *Assignment – To print prime numbers between 1 and 100
	 */
	public static void PrimeNumbers()
	{
		boolean isprime =true;
		System.out.println("Prime numbers between 1 and 100");
		System.out.println("1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97");
		for(int i =1;i<=100;i++)
		{
			//System.out.println(i);
			for(int j =i-1;j>1;j--)
			{
				if(i%j ==0)
				{	isprime=false;
					break;
				}
			}
			if(isprime)
			{
				System.out.print(i+" ");
				
			}
			isprime=true;
		}
	}
}
