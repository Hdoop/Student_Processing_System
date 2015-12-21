/**
 * 
 */
package com.assignment.example;
import java.util.*;
/**
 * @author ravinder
 *
 */
public class Section4thAssig2 {

	/**
	 * 
	 */
	public Section4thAssig2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sort an array then insert element 		
		int []arrayx =new int[]{10,20,30,40,50,100,10,33,56,19,99};
		System.out.println("Before Sorting...");
		
		System.out.println(Arrays.toString(arrayx));
		
		Arrays.sort(arrayx);
		System.out.println("After Sorting...");
		System.out.println(Arrays.toString(arrayx));
		
		arrayx=InsertEle(arrayx,1001);		
		System.out.println("Element Inserted At The End");		
		System.out.println(Arrays.toString(arrayx));
		
				
	}
	private static int[] InsertEle(int []ary ,int ele)
	{
		int []ary1=Arrays.copyOf(ary, ary.length+1);
		ary1[ary.length]=ele;
		return ary1;
	}
}
