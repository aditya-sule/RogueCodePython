import java.util.*;

public class NcrExample
{
	int factorial(int n)
	{
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		return f;
	}
	public static void main(String [] args)
	{
		System.out.println("Enter n and r");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		NcrExample e = new NcrExample();
		float nCr = (e.factorial(n))/(e.factorial(r)*e.factorial(n-r));
		System.out.println("nCr is " +nCr);
	}
}