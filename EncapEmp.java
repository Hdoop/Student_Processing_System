package com.assignment.example;

public class EncapEmp {

	
	public enum Performance 
	{
		Good,
		Average,
		VGood,
		Bad,
	}
	public EncapEmp(int empid,String empname,double sal,Performance per) {
		this.setEmpid(empid); 
		this.setEmpName(empname);
		this.setPerformance(per);
		this.setSal(sal);
	}
	private int empid;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		if(empid%2==0)
		{
			this.empid = empid+1;
		}
		this.empid = empid;
	}
	private String empName;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	private Performance performance;
	public Performance getPerformance() {
		return performance;
	}
	public void setPerformance(Performance performance) {
		this.performance = performance;
	}
	private double sal;
	public double getSal() {
		return sal;
	}
	/**
	 * @param sal
	 */
	public void setSal(double sal) {
		switch(this.performance)
		{
			case Average:	
			{
				this.sal=sal; 
				break;
			}
			case Good:	
			{
				this.sal=(sal*0.10)+sal; 
				break;
			}
			case VGood:	
			{
				this.sal=(sal*0.15)+sal; 
				break;
			}
			case Bad:	
			{
				this.sal=(sal/31)*31-2; 
				break;
			}
			
		}
	}
}
