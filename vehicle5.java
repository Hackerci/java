interface Vehicle
{
	void gear_change(int g);
	void speed_up(int s);
	void apply_break(int a);
}


class Bicycle implements Vehicle
{
	int gear;
	public void gear_change(int g)
	{
		gear=g;
		System.out.println("Bicycle is on  "+gear+"  gear");
	}
	
public void speed_up(int s)
	{
		int speed=++s;
		System.out.println("Bicycle speed increased by"+speed);
	}
	
	public void apply_break(int a)
	{
		int speed=--a;
		System.out.println("Bicycle speed decreased by "+speed);
	}
}


 class Car implements Vehicle
{
	int gear;
	public void gear_change(int g)
	{
		gear=g;
		System.out.println("car is on  "+gear+"  gear");
	}
	
public void speed_up(int s)
	{
		int speed=++s;
		System.out.println("car speed increased by  "+speed);
	}
	
	public void apply_break(int a)
	{
		int speed=--a;
		System.out.println("car speed decreased by  "+speed);
	}
}


class Bike implements Vehicle
{
	int gear;
	public void gear_change(int g)
	{
		gear=g;
		System.out.println("Bike is on  "+gear+"  gear");
	}
	
public void speed_up(int s)
	{
		int speed=++s;
		System.out.println("Bike speed increased by"+speed);
	}
	
	public void apply_break(int a)
	{
		int speed=--a;
		System.out.println("Bike speed decreased by "+speed);
	}
}

class Demo
{
public static void main(String [] args)
{
	System.out.println("\t Bicycle details");
	Bicycle b=new Bicycle();
	b.gear_change(2);
	b.speed_up(3);
	b.apply_break(4);
	
	System.out.println("\t Car details");
	
	Car c=new Car();
	c.gear_change(4);
	c.speed_up(300);
	c.apply_break(2);
	
	System.out.println("\t Bike details");
	
	Bike b1=new Bike();
	b1.gear_change(2);
	b1.speed_up(344);
	b1.apply_break(32);
}
}