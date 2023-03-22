package org.braindata.impl;

import task4org.braindata.model.Student;

public class Display extends Student
{
	public void Studentfirst()
	{
		Display d=new Display();
		d.setRollno(1);
		System.out.println(d.getRollno());
		d.setName("ABC");
		System.out.println(d.getName());
		d.setMobileno(12345678890L);
		System.out.println(d.getMobileno());
		d.setFees(1000d);
		System.out.println(d.getFees());
		d.setAddress("KOP");
		System.out.println(d.getAddress());
		d.setClgname("NPK");
		System.out.println(d.getClgname());
	}
	public void StudentSecond()
	{
		Display d1=new Display();
		d1.setRollno(2);
		System.out.println(d1.getRollno());
		d1.setName("EFG");
		System.out.println(d1.getName());
		d1.setMobileno(12345678890L);
		System.out.println(d1.getMobileno());
		d1.setFees(2000d);
		System.out.println(d1.getFees());
		d1.setAddress("KOP");
		System.out.println(d1.getAddress());
		d1.setClgname("NPK");
		System.out.println(d1.getClgname());
	}
	

}
