package calculator;

import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator 
{
		int a=0;
		int b=0;
		
		public Calculator(int x, int y)
		{
			a=x;
			b=y;
			
		}
		
		public void add()
		{
			System.out.println("addition of a and b is: ");
			System.out.println(a+b);
		}
		
		public void sub()
		{
			System.out.println("subtraction of a and b is:");
			System.out.println(a-b);
		}
		 
		public void mul()
		{
			System.out.println("multiplication of a and b is:");
			System.out.println(a*b);
		}
		
		public void div()
		{
			System.out.println("devition of a and b is: \t");
			System.out.println(a/b);
		}
		
		public static void main(String []args)
		{
			
			new ChromeDriver().close();
					
					
			new Calculator(10,10).add();
			new Calculator(10,10).sub();
			new Calculator(10,10).mul();
			new Calculator(10,10).div();
		}
		
		
		
		
}
