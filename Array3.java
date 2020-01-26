import java.util.*;

public class Array3
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
		
		int large = a[0];
		for(int i=1;i<=n-1;i++)
		{
			if(large <a[i])
				large=a[i];
		}
			
		
		System.out.println("entered elements are");
		
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}
}