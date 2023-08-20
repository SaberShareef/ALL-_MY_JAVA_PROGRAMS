package Practice3;

public class Varaibleoverloading 
{
	int a=1;
	int b=20;
	
	public void method1(int x)
	{
		b=x;
		System.out.println(b);
	}
	
	public void method2()
	{
		int y=a+b;
		System.out.println(y);
	}
	
	public static void main(String args[])
	{
		Varaibleoverloading obj=new Varaibleoverloading();
		System.out.println(obj.a);			//before overriding
		obj.a=10;
		System.out.println(obj.a);			//after overriding
		

		System.out.println(obj.b);			//before overriding
		
		obj.method1(60);					//after overriding
		obj.method2();
		Callbyreferance obj1=new Callbyreferance();
		obj1.method2(new Varaibleoverloading());
		
		
	}

}
