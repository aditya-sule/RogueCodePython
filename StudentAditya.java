import java.util.*;

public class StudentAditya
{
	int roll;
	String name;
	
	void getData()
	{
		System.out.println("enter name and roll no");
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		roll = sc.nextInt();
	}
	void showdata()
	{
		System.out.println("name is " +name);
		System.out.println("roll no is " +roll);
	}
	public static void main(String [] args)
	{
			StudentAditya s = new StudentAditya();
			s.getData();
			s.showdata();
	}
}


//acceptInfo() and showInfo() as member function