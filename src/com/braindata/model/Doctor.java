package com.braindata.model;

public class Doctor 
{
	protected int id;
	protected String name;
	protected String add;
	protected String hospitalname;
	protected long mobno;
	protected double salary;
	
	protected void id()
	{
		System.out.println("id="+ 101);
		
	}
	protected void name()
	{
		System.out.println("name="+ "ABC");
	}
	protected void hospitalname()
	{
		System.out.println("hospitalname="+ "DYP");
	}
	protected void mobno()
	{
		System.out.println("mobno="+ 1234567890l);
	}
	protected void salary()
	{
		System.out.println("salary="+ 50000);
	}
	protected void add()
	{
		System.out.println("add="+ "KOP");
	}
	
	
	

}
