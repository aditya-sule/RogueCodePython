import java.util.*;

public class Fibo
{
	public static void main(String [] args)
	{
		System.out.println("Enter a number");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int a=0, b=1,c;
		System.out.println("The Fibo series is");
		System.out.println("0\n1");
		for(int i = 1; i<=n-2 ; i++)
		{
			c = a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}
}