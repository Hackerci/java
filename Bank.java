package bank;
import java.util.*;
public class bank {
	String name;
	String dob;
	int i;
	static int balance = 50000 ; 
	int acc_no;
	int amount1=balance, amount2, dpst, wtdr,a=0, b=0, n;
public 

	void getdata(int i)
	{
		Scanner sc= new Scanner(System.in);{
		//bank b2 = new bank();
		System.out.print("Enter your first name: ");
		name = sc.next();
		System.out.println("Enter your birth date: ");
		dob =sc.next();
		acc_no=1234+i;
		System.out.println("Your account no. is "+acc_no);
		}
	}
	void display(int i)
	{
		System.out.println(acc_no+"\t\t"+name+"\t\t"+dob+"\t"+balance);
	}
	void deposit()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Deposit process:\nDo you want to continue? (Press 1 if yes, 0 if No)");
		a = sc.nextInt();
		if (a==1)
			{
			System.out.println("Enter amount to be deposited: ");
			dpst=sc.nextInt();
			amount1=balance+dpst;
			System.out.println("Amount deposited successfully");
			}
		else
			amount1=balance+0;
	}
	void withdrawl()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Withdrawl process:\nDo you want to continue? (Press 1 if yes, 0 if No)");
		b = sc.nextInt();
		if (b==1)
			{System.out.print("Enter amount to be withdrawed: ");
			wtdr=sc.nextInt();
			if (wtdr<balance && wtdr<10000)
			{
			amount2=amount1-wtdr;
			System.out.println("Amount withdrawed successfully!");
			}
			else
			{System.out.println("You are exceeding withdrawl limit");
			amount2=amount1-0;}
			}
		else
			amount2=amount1-0;
	}
	void checkbalance()
	{
		if (a==1 && b==1)
		{
			System.out.println("Your balance is "+amount2);
		}
		else if (a==1 && b==0)
		{
			System.out.println("Your balance is "+amount1);
		}
		else if (a==0 && b==1)
		{
			System.out.println("Your balance is "+amount2);
		}
		else
		{
			System.out.println("Your balance is "+balance);
		}
	}
	
public static void main(String[] args) {
	int ch=0, key,flag=0;
	System.out.println("Welcome");
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter number of customers: ");
	int n= sc.nextInt();
	bank b[] = new bank[n];
	for (int i=0; i<n; i++)
	{
		b[i]=new bank();
	}
	
	
	for (int i=0; i<n; i++)
		{	
		System.out.println("\nEnter data of Customer-"+(i+1));
		b[i].getdata(i);
		}
	System.out.println("Account no.\tName\t\tBirth date\tBalance");
	for (int i=0;i<n;i++)
	{
		b[i].display(i);
	}
	
						do
						{
								System.out.println("Enter account no. with which you have to do transactions.");
								key = sc.nextInt();
								
								for (int i=0; i<n; i++)
								{
									if(key == b[i].acc_no)
									{
										flag++;
										do
										{
										System.out.println("\nEnter the choice of operation to be performed: \n1.Display Info \n2.Deposit \n3.Withdrawl \n4.Check balance\n5.Sign Out \n6.Exit");
										ch=sc.nextInt();
										switch (ch)
										{
										case 1: System.out.println("Account no.\tName\t\tBirth date\tBalance");
											b[i].display(i);
										break;
										case 2: b[i].deposit();	
										break;
										case 3: b[i].withdrawl();
										break;
										case 4: b[i].checkbalance();
										break;
										default:
											System.out.println("Thank you ");
											break;
										}
										}while(ch<5);
									}
								}
								if (flag==0)
								{
									System.out.println("Enter a valid account number.");
								}
								}while (ch<6);		 
		System.out.println("Banking operations terminated");
}
}
