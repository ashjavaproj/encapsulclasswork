package Com.kolhapur;

import Com.pune.A;

public class Z extends A{
	public void m3()
	{
		Z z=new Z();
		System.out.println("Protected value is "+z.a+" access from diffrent packege in this child class"); 
		
	}
	public static void main(String args[])
	{
		

		Z z=new Z();
		z.m3();
	}
	

}
