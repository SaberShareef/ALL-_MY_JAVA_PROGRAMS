package callbyref.methods;

public class ClassC 
{
	int a;
	int b;
	
	int e=150;
	
	double c;
	double d;
	 
	public int add(int x, int y)
	{
		a=x;
		b=y;
		
		return x+y;
	}
	
	public int sub(int x, int y)
	{
		a=x;
		b=y;
		return a-b;
	}
	
	public double mul(double x, double y)
	{
		c=x;
		d=y;
		return c*d;
	}
	

}
