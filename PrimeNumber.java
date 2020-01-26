import java.util.*;

public class PrimeNumber
{
	public static void main(String [] args)
	{
		System.out.println("Enter a number");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int i =2;
		
		while(n%i != 0)
			i++;
		if(n==i)
			System.out.println(n + " is Prime number");
		else
			System.out.println(n + " is Not a prime number ");

	}
}