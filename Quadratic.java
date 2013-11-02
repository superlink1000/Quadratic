//Brandon Walsh 
import java.util.Scanner;
import java.lang.Math;

class Quadratic
{
	public static int a, b, c;

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("Please the first coefficient:");
		int a = kb.nextInt();

		System.out.println("Please the second coefficient:");
		int b = kb.nextInt();

		System.out.println("Please the third integer");
		int c = kb.nextInt();

		Quadratic r1 = new Quadratic(a, b, c);
		Quadratic();

	}

	public Quadratic(int x, int y, int z)
	{
		a = x;
		b = y;
		c = z;
	}

	public static void Quadratic()
	{
		System.out.println("The quadratic is: " + a + "x^2+" + b + "x+" + c);
		/*
		Quad Formula: (-b +- sqrt(b*b - 4*a*c))/2*a
		*/

		double x1 = (-b + (Math.sqrt((b*b) - (4*a*c))))/(2*a);
		double x2 = (-b - (Math.sqrt((b*b) - (4*a*c))))/(2*a);

		System.out.println(x1);
		System.out.println(x2);

	}
}