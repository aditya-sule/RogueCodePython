import java.util.*;

public class Cricketer
{
	String name;
	int matches;
	int totalscore;
	float avg;

	Cricketer()
	{
		System.out.println(" Enter name,matches,totalscore ");
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		matches = sc.nextInt();
		totalscore = sc.nextInt();
	}
	void battingavg()
	{
		avg = (float)totalscore/matches;
	}
	void Display()
	{
		System.out.println("Name of cricketer is " +name);
		System.out.println("total matches played are " +matches);
		System.out.println("total score is " +totalscore);
		System.out.println("average is " +avg);
	}
	public static void main(String [] args)
	{
		Cricketer c = new Cricketer();
		c.battingavg();
		c.Display();
	}
}