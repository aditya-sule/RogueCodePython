import java.util.*;

public class EmployeeConstructor
{
	int id;
	float salary;
	String name;
	
	EmployeeConstructor()
	{
		System.out.println("Enter name,id and salary");
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		id = sc.nextInt();
		salary = sc.nextFloat();
	}
	void showinfo()
	{
		System.out.println("Employee name is " +name);
		System.out.println("Employee id is " +id);
		System.out.println("Employee salary is " +salary);
	}
	public static void main(String [] args)
	{
		EmployeeConstructor s = new EmployeeConstructor();
		s.showinfo();
	}
}
	