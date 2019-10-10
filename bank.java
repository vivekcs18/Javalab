import java.util.*;
import java.lang.*;
class account
{
	public String name;
	public int acc_no;
	public double bal;
	//public double ci=0;

	public void accept()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("\nEnter the name of the account holder: ");
		name=s.next();
		System.out.print("Enter the account number: ");
		acc_no=s.nextInt();
		System.out.print("Enter the account balance: ");
		bal=s.nextDouble();
	}

	public void display()
	{
		System.out.println("*Details*");
		System.out.println("Name: "+name+"\nAccount number: "+acc_no+"\nBalance: "+bal);
	}

	/*public void compound_interest()
	{
		System.out.println("\nRate of interest= 5% and no of years = 3");
		ci=ci+bal*(Math.pow((1+(6/100)),3));
		System.out.println("compound interest= Rs"+ci);
	}*/

}

class savings extends account
{
	public void cheque()
	{
		System.out.println("\nNo cheque services");
	}

	public void withdrawal()
	{
		float amount;
		Scanner a=new Scanner(System.in);
		System.out.println("\nNo minimun balance required");
		System.out.print("Enter the amount to be withdrawm: ");
		amount=a.nextFloat();
		if(amount>super.bal)
		{
			System.out.println("Balance is insufficient");
		}
		else
		{
			super.bal=super.bal-amount;
			System.out.println(amount+" withdrawm");
			System.out.println("Available balance= "+super.bal);
		}
	}
}

class current extends account
{
	public void cheque()
	{
		System.out.println("\nCheque services available");
	}

	public void withdrawal()
	{
		float amount;
		Scanner a=new Scanner(System.in);
		System.out.println("\nMinimun balance= Rs.1000.00");
		if(super.bal<1000)
    {
      System.out.println("Balance is insufficient to withdraw");
      double service_charge;
      service_charge=(1*super.bal)/100;
      super.bal=super.bal-service_charge;
      System.out.println("Service charge of Rs"+service_charge+" is added");
      System.out.println("Available balance= Rs"+super.bal);
    }
		else
		{
			System.out.print("Enter the amount to be withdrawm: ");
			amount=a.nextFloat();
			if(amount>(super.bal-1000))
			{
				System.out.println("Balance is insufficient");
			}
			else
			{
				super.bal=super.bal-amount;
				System.out.println(amount+" withdrawm");
				System.out.println("Available balance= "+super.bal);
		                                                                      }
		                                                                       }
		
	                                                                           }
}

class bank
{
	public static void main(String args[])
	{
		savings obj1[]=new savings[10];
		current obj2[]=new current[10];
		System.out.print("Enter the number of accounts: ");
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int i=0;
		int j=0;
		int k=0;
		while(i<n)
		{
			System.out.println("\nAccount "+(i+1));
			System.out.println("\n1)Savings\n2)Current");
			System.out.print("Enter the type of account: ");
			int ch=x.nextInt();
			if(ch==1)
			{
				obj1[j]=new savings();
				obj1[j].accept();
				obj1[j].display();
				obj1[j].cheque();
				//obj1[j].compound_interest();
				obj1[j].withdrawal();
				j++;
			}
			else
			{
				obj2[k]=new current();
				obj2[k].accept();
				obj2[k].display();
				obj2[k].cheque();
				//obj2[k].compound_interest();
				obj2[k].withdrawal();
				k++;
			}
			i++;
		}
	}
}
