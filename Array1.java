import java.util.*;

public class Array1
{
	public static void main(String [] args)
	{
		System.out.println("enter the no of elements");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter the values");
		for(int i=0;i<=n-1;i++)
			a[i] = sc.nextInt();
		System.out.println("entered elements are");
		
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}
}