
import java.util.*;

public class Student
{

	//Member Variables
	int roll;
	String name;
	
	
	//Member Functions -- Methods
	void getData()
	{
		System.out.println("Enter name and roll number");
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		roll = sc.nextInt();
	}
	void showData()
	{
		System.out.println("Name is "+name);
		System.out.println("Roll number is "+roll);
	}
	
	
	public static void main(String [] args)
	{
 		Student s = new Student();
		s.getData();
		s.showData();
	}

}