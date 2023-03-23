package Com.pune;

public class B {
	public void m2()
	{
		A a=new A();
	System.out.println("private value is "+a.y+" not access out of class");//error
	System.out.println("Default value is "+a.x);
    }
    public static void main(String args[])
    {
    	A a=new A();
    	a.m1();
    	B b=new B();
    	b.m2();
    	
    }
    
  }