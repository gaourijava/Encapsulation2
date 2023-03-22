package com.cjc.model;

 class Laptop   //default class cannot access.so i changed it to 
{                          //public.
	private int modelno;
	private String lname;
	private double lprize;
	
	private void m1()
	{
		int x=200;
		System.out.println("Model no="  +x);
	}
	private void m2()
	{
		String ln="LG";
		System.out.println("Lname="+  ln);
	}
	private void m3()
	{
		double d=30000;
		System.out.println("lprize="+  d);
	}
	public static void main(String args[])
	{
		Laptop l =new Laptop();
		{
			l.m1();
			l.m2();
			l.m3();
		}
	}
	
	
	
	

}
