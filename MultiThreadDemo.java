import java.io.*;
class Base1 implements Runnable

{
	public void run()
	{
		for(int i=1; i<=5;i++)
		{
			try
			{
				System.out.println("Value of i:---"+i);
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println("endn of thread x");
			}
		}
	}
}
class Base2 implements Runnable
{
	public void run()
	{
		try
		{
			for(int j=11;j<=15;j++)
			{
				System.out.println("value of j;---"+j);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
			{
				System.out.println("endn of thread y");
			}
	}
} 
public class MultiThreadDemo
{
	public static void main(String args [])
	{
		Base1 b1 = new Base1();
		
		Thread th1 = new Thread(b1);
		th1.start();
		
		Base2 b2 = new Base2();
		
		Thread th2= new Thread(b2);
		th2.start();
	}
}

	





