import java.util.*;

public class Multiplication
{
	public static void main(String [] args)
	{
		System.out.println("Enter a number");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		System.out.println("Multiplication table of "+n +" is");

		for(int i = 1; i<=10 ; i++)
		{
			System.out.println(n +" x "+ i+ " = "+ (n*i));
		}

	}
}