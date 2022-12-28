import java.util.*;
abstract class Shape 
{
	double length,breadth;
		Scanner sc=new Scanner(System.in);
	void input()
	{
	
		System.out.println("enter the length");
		length=sc.nextDouble();
		System.out.println("enter the breadth");
		breadth=sc.nextDouble();
	}
	public abstract void compute_area();
}

	class Triangle extends Shape
	{
		public void compute_area()
		{
			double a=length*breadth/2;
			System.out.println("area of triangle"+a);
		}
	}
	
		class Rectangle extends Shape
	{
		public void compute_area()
		{
			double a=length*breadth;
			System.out.println("area of triangle"+a);
		}
	}
	
	class Main
	{
	public static void main(String[] args) {
		Triangle t=new Triangle();
		t.input();
		t.compute_area();
		
       Rectangle r=new Rectangle();
		r.input();
		r.compute_area();
	}
	}