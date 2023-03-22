package task4org.braindata.model;

public class Student 
{
	protected int rollno;
	protected String name;
	protected long mobileno;
	protected double fees;
	protected String address;
	protected String clgname;
	
	public void setRollno(int  rollno)
	{
		this.rollno=rollno;
	}
	public int getRollno()
	{
		return rollno;
	}
	public void setName(String name) 
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setMobileno(long mobileno)
	{
		this.mobileno=mobileno;
	}
	public long getMobileno()
	{
		return mobileno;
	}
	public void setFees(double fees)
	{
		this.fees=fees;
	}
	public double getFees()
	{
		return fees;
	}
	public void setAddress(String add)
	{
		this.address=add;
	}
	public String getAddress()
	{
		return address;
	}
	public void setClgname(String clgname)
	{
		this.clgname=clgname;
	}
	public String getClgname()
	{
		return clgname;
	}
		
	
	

}
