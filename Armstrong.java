import java.util.*;

public class Armstrong
{
	public static void main(String [] args)
	{
		System.out.println("My changes");
		System.out.println("Enter a number");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		if(count!=0)
		{
		int copy = n;
		}
		int sum=0;
		while (n!=0)
		{
			int ld = n%10;	
			sum = sum + ld*ld*ld;
			n = n/10;
		}


		if(sum == copy)
			System.out.println(copy+ " is Armstrong number");
		else
			System.out.println(copy+ " is not Armstrong number");

	}
}