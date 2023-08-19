package My_Programs;

public class ArithOpera_withmethod 
{
	int a=10;
	int b=05;
	
	public void sum()
	{
		int sum=a+b;
		System.out.println("addition of a and b is = " + sum);
	}
	
	public void sub()
	{
		int sub=a-b;
		System.out.println("substraction of a and be is = " + sub);
	}
	
	public void mul()
	{
		int mul=a*b;
		System.out.println("multiplication of a and b is = " + mul);
	}

	public void div()
	{
		int div=a/b;
		System.out.println("divition of a and b is = " + div);
	}
	
	
	//arithmatic opearations with  variable and method overloading concept
	
	public void sum(int x, int y)
	{
		int a=x;
		int b=y;
		int sum=a+b;
		System.out.println("addition of two numbers is = " + sum);
	}
	
	public void sub(int x, int y)
	{
		int a=x;
		int b=y;
		int sub=a-b;
		System.out.println("additoin of two numbers is =" + sub);
	}
	
	public void mul(int x, int y)
	{
		int a=x;
		int b=y;
		int mul=a*b;
		System.out.println("additoin of two numbers is =" + mul);
	}
	
	public void div(int x, int y)
	{
		int a=x;
		int b=y;
		int div=a/b;
		System.out.println("additoin of two numbers is =" + div);
	}
	
	public static void main(String args[])
	{
		//calling instance methods
		System.out.println(" \nArithmatic operations calling methods using constructor object \n" +  " ");
		new ArithOpera_withmethod().sum();
		new ArithOpera_withmethod().sub();
		new ArithOpera_withmethod().mul();
		new ArithOpera_withmethod().div();
		System.out.println("_____________________________________________________________________________");
		
		//calling methods by creating object to class instance/constructor
		System.out.println(" \nArithmatic operations calling methods using created object \n" +  " ");
		ArithOpera_withmethod obj=new ArithOpera_withmethod();
		obj.sum();
		obj.sub();
		obj.mul();
		obj.div();
		System.out.println("_____________________________________________________________________________");
				
		//calling overloaded methods
		System.out.println(" \nArithmatic operations with overloading feature \n" +  " ");
		obj.sub(20, 20);
		obj.sub(20, 20);
		obj.mul(20, 20);
		obj.div(20, 20);
		
		
	}
}
