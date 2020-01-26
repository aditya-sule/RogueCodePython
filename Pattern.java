import java.util.*;
class Star extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.print("*");
			try{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
			
			}
		}
	}
}
class Slash extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.print("/");
			try{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
			
			}
		}
	}
}
public class Pattern
{
	public static void main(String [] args)
	{
		Star st = new Star();
		Slash sl = new Slash();
		st.start();
		sl.start();
	}
}

	
	