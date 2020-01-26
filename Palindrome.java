import java.util.*;

public class Palindrome
{
	public static void main(String [] args)
	{
		System.out.println("Enter a number");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int copy = n;
		int rev=0;
		while (n!=0)
		{
			int ld = n%10;	
			rev= rev*10 +ld;
			n = n/10;
		}


		if(rev == copy)
			System.out.println(copy+ " is Palindrome number");
		else
			System.out.println(copy+ " is not Palindrome number");

	}
}