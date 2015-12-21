/**
 * 
 */
package com.assignment.example;

import java.util.Scanner;

/**
 * @author ravinder
 *
 */
public class Section4thAssig1 {

	/**
	 * 
	 */
	public Section4thAssig1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print the initalized array in reverse order
		int []arrayx =new int[]{10,20,30,40,50};
		for(int i=arrayx.length-1;i>=0;i--)
		{
			System.out.println("At index "+i+": "+arrayx[i]);
		}
		
		
		//Print 2d array in reverse order 
		int [][]array2d =new int[][]{{10,20},{20,30},{30,40},{40,50},{50,60}};
		for(int j=array2d.length-1;j>=0;j--)
		{
			for(int i=0;i<=array2d[0].length-1;i++)
			{
				System.out.print("At index "+i+","+j+": "+array2d[j][i]+" ");
			}
			System.out.println();
		}
		//For string data type .
		String [][]array2dstr =new String[][]{{"Ravinder","Big Data"},{"Mark","Oracle DBA"},{"John",".Net"},{"Kapler","Sql"},{"Peter","Front End Developer"}};
		for(int j=array2dstr.length-1;j>=0;j--)
		{
			for(int i=0;i<=array2dstr[0].length-1;i++)
			{
				System.out.print("At index "+i+","+j+": "+array2dstr[j][i]+" ");
			}
			System.out.println();
		}
		//By taking input from use and print it in reverse order 
		int []arrayinput =new int[5];
		System.out.println("Enter five values :");
		Scanner sc = new Scanner(System.in);
		for(int i =0 ;i<=arrayinput.length-1;i++)
		{
			arrayinput[i]=sc.nextInt();
		}
	    
		System.out.println("Print values :");
		for(int i=arrayinput.length-1;i>=0;i--)
		{
			System.out.println("At index "+i+": "+arrayinput[i]);
		}
	}
}
