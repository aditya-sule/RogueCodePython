import java.util.*;

public class Studentcon
{
	int roll;
	String name;
	
	Studentcon(int r,String n)
	{
		roll=r;
		name=n;
	}
	void display()
	{
		System.out.println("name is " +name+ "\nroll no is " +roll);
	}
	public static void main(String [] args)
	{
		Studentcon s = new Studentcon(101,"pri");
		s.display();
	
		System.out.println("Enter name and roll no ");
		Scanner sc = new Scanner(System.in);
		String asd = sc.nextLine();
		int poi = sc.nextInt();
		
		Studentcon s2 = new Studentcon(poi,asd);
		s2.display();
	}
}