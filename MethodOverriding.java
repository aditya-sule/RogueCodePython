import java.io.*;
class Base
{
	void arith(int a,int b)
	{
		System.out.println("Addition is :"+(a+b));
	}
}
class Child extends Base
{
	void arith(int a,int b)
	{
		super.arith(30,20);
		System.out.println("Multiplication is "+(a*b));
	}
}
public class MethodOverriding
{
	public static void main(String args[])
	{
		Child Ch = new Child();
		Ch.arith(30,20);
	}
}
