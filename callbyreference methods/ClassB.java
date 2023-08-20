package callbyref.methods;

import callbyref.Testproduct;

public class ClassB 
{
	int z;
	public ClassA name()
	{
		return new ClassA();
	}
	
	public ClassC result()
	{
		return new ClassC();
	}

	public static void main(String[] args) 
	{
		ClassB obj=new ClassB();
		String obj1=obj.name().name();
		System.out.println(obj1);
		
		int obj2=obj.name().num();
		System.out.println(obj2);
		
		double obj3=obj.name().value();
		System.out.println(obj3);
		
		System.out.println("   ");
		
		int obja=obj.result().add(10, 10);
		System.out.println("the addition is " + obja);
		
		int objs=obj.result().sub(20, 10);
		System.out.println("the substraction is " + objs);
		
		double objm=obj.result().mul(10.00, 20.00);
		System.out.println(objm);
		
		int objee=obj.result().e;				
		System.out.println(objee);
		
		obj.z=10;
		System.out.println(obj.z);
		
		ClassA Aobj=new ClassA();
		String actualobj=Aobj.name();
		System.out.println(actualobj);
		
		int Apackage=new Testproduct().method4();
		System.out.println(Apackage);
		
		
		
	}

}
