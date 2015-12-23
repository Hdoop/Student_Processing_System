package com.assignment.example;

public class EncapMain {

	public EncapMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		EncapEmp emp =new EncapEmp(0,"Ravinder",100000,EncapEmp.Performance.VGood);
		
		System.out.println("Empname Is :"+emp.getEmpName());
		System.out.println("Sal Is :"+emp.getSal());
		
	}

}
