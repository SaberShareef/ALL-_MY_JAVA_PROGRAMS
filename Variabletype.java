package Practice3;

import appfunctioning.Appfunc;

public class Variabletype 
{
	int a=20;	//global variables
	int b=30;	//global variables
	
	public void add()
	{
		int c=a+b;	//C is a local variable 
		System.out.println("the addition of a and b is stored in c ="+c);
		
	}
	 
	public void sub()
	{
		int d=a-b;	//d is a local variable
		System.out.println("the subtraction of a and b is stored in d ="+d);
	}
	
	public static void string()
	{

		System.out.println("THE STRING VALUES ARE GROUP OF CHARECTOR AND NUMBERS");
	}
	
	public static void bolean()
	{
		System.out.println("the boolean values are true or false");
	}
	
	public static void main(String args[])
	{
		Variabletype obj=new Variabletype();
		int val_a=obj.a;		//calling global variable in main function
		int val_b=obj.b;		//calling global variable in main function
		System.out.println("value of a is "+val_a);
		System.out.println("value of b is "+val_b);
		obj.add();
		obj.sub();
		obj.add();
		new Variabletype().add();
		obj.sub();
		string();
		bolean();
		new Appfunc().pageopen();
	}



}
