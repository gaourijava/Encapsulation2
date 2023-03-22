package org.braindata.model3;

public class Student 
{
	int rollno;
	String name;
	long mobileno;
	double fees;
	String address;
	String clgname;
	
	public void rollno()
	{
		System.out.println("rollno=" +10);
	}
	void name()
	{
		System.out.println("name=  "+"ABC");
	}
	protected void mobileno()
	{
		System.out.println("mobno=" +1023456789l);
	}
	private void fees()
	{
		System.out.println("fees=" +10000d);
	}
	protected void add()
	{
		System.out.println("add=" +"KOP");
	}
	void clgname()
	{
		System.out.println("clgname=" +"DYP");
	}
	public static void main(String args[])
	{
		Student s=new Student();
		s.rollno();
		s.name();
		s.mobileno();
		s.fees();
		s.add();
		s.clgname();
		
		
	}

	

}
