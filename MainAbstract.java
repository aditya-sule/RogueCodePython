import java.util.*;
abstract class Base
{
	protected float r,vol;
	public void read(float x)
	{
		r=x;
	}
	public abstract void calculate();
	public void display()
	{
		System.out.println("Volume =" +vol);
	}
}
class Sphere extends Base
{
	public void calculate()
	{
		vol= 3.14f*r*r*r*4/3;
	}
}
class Hemisphere extends Base
{
	public void calculate()
	{
		vol=3.14f*r*r*r*2/3;
	}
}

public class MainAbstract
{
		public static void main(String args[])
		{
			float x;
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the radius");
			x = sc.nextFloat();
			Sphere s = new Sphere();
			s.read(x);
			s.calculate();
			s.display();
			
			Hemisphere h = new Hemisphere();
			h.read(x);
			h.calculate();
			h.display();
			
		}
}