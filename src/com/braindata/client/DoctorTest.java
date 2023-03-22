package com.braindata.client;

import com.braindata.model.Doctor;

public class DoctorTest extends Doctor
{
	public static void main(String args[])
	{
	DoctorTest d=new DoctorTest();     //chid class object is necessary
	d.id();
	d.name();
	d.hospitalname();
	d.add();
	d.mobno();
	d.salary();
	}

}
