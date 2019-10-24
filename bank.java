import java.util.*;
import java.lang.Math;

class Account
{
 	public String name;
 	public double acc;

 
 	public void details()
 	{ 
 		Scanner sc = new Scanner(System.in);
 
 		System.out.println("Enter your Name : ");
 		name = sc.next();
 		System.out.println("Enter your Account number : ");
 		acc = sc.nextLong();
 
 	}

 	public void output(int n)
 	{
 		System.out.println("\tAccount Holder's Name : " +name);
 		System.out.println("\tAccount Number : " +acc);
		 if(n==1)
		 System.out.println("\tAccount type: SAVINGS");
		 if(n==2)
 		System.out.println("\tAccount type: CURRENT");
 	}
 
 }

class sav_acc extends Account
{
 
 	Scanner sc = new Scanner(System.in);
 	double t,r;
 	double ci;
 	double bal,dep;
 	
 	void deposit()
 	{
 		System.out.println("Enter balance in account");
 		bal=sc.nextInt();
 		System.out.println("Enter amount to deposited");
 		dep=sc.nextInt();
 		bal=bal+dep;
	 }
 	void disp()
 	{
 		System.out.println("BALANCE :"+bal);
 	}	
 	void ci()
 	{
		 System.out.println("How long has it been that you deposited your amount");
 		t = sc.nextDouble();
 		System.out.println("Enter the rate at which the amount is to be compounded");
 		r = sc.nextDouble();
 		
 		ci = bal*(Math.pow((1.0 + (r/100)),t));
 		System.out.println("Amount after interest = "+ci);
 	}
 
	 public void savings()
	 {
 		int choice;
 		int amount;
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Press 1 to see amount earned through interest");
 		System.out.println("Press 2 to withdraw");
 		choice = sc.nextInt();
 		switch(choice)
 		{
 
 		case 1 : ci();
 
 		break;

 		case 2 : 
 			System.out.println("Enter the amount you want to withdraw");
 			amount = sc.nextInt();
 			System.out.println("The entered amount " + "\"" + amount + "\"" + "has been withdrawn");
 			bal = bal - amount;
 			System.out.println("Enter the minimum balance");
 			int min=sc.nextInt();
			if(bal < min)
 			{
 			System.out.println("Your Balance is less than required minimum balance");
 			System.out.println("Service Charge will be imposed, @ 5% of the required minimum balance per day");
 			bal = bal - (0.05*bal);
 			 System.out.println("Remaining Balance : " +bal);
 			}
 			else
 			{
 			bal = bal - amount;
 			 System.out.println("Remaining Balance : " +bal);
  			}
 			break;
 		}
	 } 
 }
 class curr_acc extends Account
 {
	 int c;
	 int amount;
 	double bal,dep;
 	Scanner sc = new Scanner(System.in);
	 void deposit()
	 {
 		System.out.println("Enter balance in account");
 		bal=sc.nextDouble();
 		System.out.println("Enter amount to deposited");
 		dep=sc.nextDouble();
 		bal=bal+dep;
 	}
	 void disp()
 	{
 		System.out.println("BALANCE :"+bal);
 	}
 	void current()
	 {
 		System.out.println("Press 1 to to Issue a Cheque Book");
		 System.out.println("Press 2 to Withdraw amount ");
 		c = sc.nextInt();
 		switch(c)
 		{
 			case 1 : System.out.println("Your Cheque Book will be Delivered to your Home");
 			break;
 
 			case 2 : System.out.println("Enter the amount you want to withdraw");
 			amount = sc.nextInt();
 			System.out.println("The entered amount "+amount +" has been withdrawn");
			System.out.println("Enter the minimum balance");
 			int min=sc.nextInt();
 			if(bal < min)
 			{
 			System.out.println("Your Balance is less than required minimum balance");
 			System.out.println("Service Charge will be imposed, @ 5% of the required minimum balance per day");
 			bal = bal - (0.05*bal);
 			 System.out.println("Remaining Balance : " +bal);
 			}
			 else
			 {
			 bal = bal - amount;
 			 System.out.println("Remaining Balance : " +bal);
  			}
 			break;
 		}
 	}
}

class bank
{
 	public static void main(String args[])
 	{ int n;
 		Scanner sc=new Scanner(System.in);
		 Account ac = new Account();
 		ac.details();
 		
 			for( ; ; )
 			{
 			System.out.println("\nWhich account do you have?");
			 System.out.println("Press 1 if you have Savings Account ");
 			System.out.println("Press 2 if you have Current Account");
 			System.out.println("Press 3 to exit");
			n=sc.nextInt();
 			ac.output(n);
 			switch(n)
 			{
 			case 1:
 			sav_acc s=new sav_acc();
 			s.deposit();
 			s.disp();
 			s.savings();
			 break;
 			case 2:
 			curr_acc c=new curr_acc();
 			c.deposit();
 			c.disp();
 			c.current();
			break;
			case 3:
			System.out.println("THANK YOU");
			System.exit(0);
			}
			}
		 }
	
}
