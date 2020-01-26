import java.util.*;

public class Convertor
{
float Height_inches;
float Height_feet;

	Convertor()
	{	
	System.out.println("enter the height in inches");
	Scanner sc = new Scanner(System.in);
	Height_inches= sc.nextFloat();
	
	}	
	void convert_feet()
	{
	Height_feet=Height_inches/12;
	}
		void display()
		{
			System.out.println(Height_inches + " inches is " + Height_feet + " feet ");
		}
			public 	static void main(String[] args)
			{
				Convertor s = new Convertor();
				s.convert_feet();
				s.display();
			}
}			