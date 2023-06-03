package project1;

public class Calculator 
{
	void add(int a,int b)
	{
		int add=a+b;
		System.out.println(add);
		
	}
	void sub(int a,int b)
	{
		int sub=a-b;
		System.out.println(sub);
	}
	void div(double a,double b)
	{
		double d=a/b;
		System.out.println(d);
	}
	void multi(double a,double b)
	{
		double m=a*b;
		System.out.println(m);
	}
	public static void main(String[] args) {
	      Calculator c=new Calculator();
	      c.add(1, 3);
	      c.sub(4, 2);
	      c.div(10, 5);
	      c.multi(4, 6);
	}
}

