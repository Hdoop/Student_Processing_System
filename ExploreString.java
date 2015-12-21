package com.assignment.example;

import java.util.Scanner;

public class ExploreString {

	public ExploreString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		String mystring =scn.nextLine();
		System.out.println("Input String Is :"+mystring);
		//Reverse the string 
		String _newstr ="";
		for(int i =mystring.length()-1;i>=0;i--)
		{
			if(mystring.toCharArray()[i]==' ')
			{
				_newstr+= Character.toUpperCase(mystring.toCharArray()[i]);
			}
			else
			{
				_newstr+= mystring.toCharArray();
			}
			_newstr+=mystring.toCharArray()[i];
		}
		System.out.println("Reverse String Is :"+_newstr);
	}

}
