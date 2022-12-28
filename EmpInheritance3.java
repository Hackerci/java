class Employee
{
	String name,address,mail;
	float id,mob_no,basic;
	
	void get_data()
	{
		float da,hra,pf,cf,gross;
		da=basic * 97/100;
		hra=basic*(10/100);
		pf=basic*(12/100);
		cf=basic*(0.1f/100);
		
		gross=basic+da+hra-pf-cf;
		
		System.out.println("Name:"+name);
		System.out.println("Mail:"+mail);
		System.out.println("mob_no:"+mob_no);
		System.out.println("basic salary:"+basic);
		System.out.println("gross salary:"+gross);
		
	}
}
class Programmer extends Employee
{
	Programmer(String name,String mail,int mob,int sal)
	{
		this.name=name;
		this.mail=mail;
		this.mob_no=mob;
		basic=sal;
	}
}

class Team_lead extends Employee
{
	Team_lead(String name,String mail,int mob,int sal)
	{
		this.name=name;
		this.mail=mail;
		this.mob_no=mob;
		basic=sal;
	}
}

class Assistant extends Employee
{
	Assistant(String name,String mail,int mob,int sal)
	{
		this.name=name;
		this.mail=mail;
		this.mob_no=mob;
		basic=sal;
	}
}

class Main
{
public static void main(String[] args)
{
	Programmer p=new Programmer("xyz","vaishu@gmail.com",73383,120000);
	p.get_data();
		System.out.println("\n\n\n\n");
	
	Team_lead t=new Team_lead("xvsvsyz","vaishu@gmail.com",7388383,120000);
	t.get_data();
	System.out.println("\n\n\n\n");
	
	Assistant a=new Assistant("xhsbsyz","vaishu@gmail.com",7388383,120000);
	a.get_data();
	
	
}
}