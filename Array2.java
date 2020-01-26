import java.util.*;

public class Array2
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
		
		//Sum and average
		int sum=0;
		for(int i=0;i<n;i++)
			sum=sum+a[i];
		float avg = (float)sum/n;
		System.out.println("sum is "+sum);
		System.out.println("avg is "+avg);
	}
}