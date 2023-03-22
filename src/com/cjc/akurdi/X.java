package com.cjc.akurdi;

import com.cjc.karve.A;

public class X extends A
{
	public void xx()
	{
		A a=new A();
		a.m1();
		//a.m2();default method cannot access out of the package
		//a.m3();private method
		//a.m4();protected method
		
		X x=new X();
		x.m1();
		//x.m2();
		//x.m3();
		x.m4();
		
		

	}

}
