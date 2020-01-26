//import java.io.*;
public class ExceptionDemo
{
	public static void main(String args[])
	{
		try
		{
			int a=10;
			int b=0;
			System.out.println("Quotient is "+(a/b));
		}
			
		catch(Exception e)
		{
			System.out.println(e);
		}

		finally
		{
			System.out.println(" this is the finally block ");

		}
	}
}
