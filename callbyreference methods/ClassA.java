package callbyref.methods;

public class ClassA 
	
{
	int f=45;
	
	String name="institute";
	int num=100;
	double value=1000.0;
	
	public String name()
	{
		return name;
	}
	
	public void nmethod(ClassA obj)
	{
		obj.name();
	}
	public int num()
	{
		return num;
	}
	
	public double value()
	{
		return value;
	}
}
