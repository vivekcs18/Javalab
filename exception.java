import java.util.*;
class AgeException extends Exception
{ String d;
 AgeException(String e)
  {
   d=e;
   }
  public String toString()
  {
  return("the age of son can't be greater than father or it cant be 0:"+ d);
  }
 
 }
 class father
 {
  int age;
  father()
  {}
  Scanner sc=new Scanner(System.in);
  void getdata() throws AgeException
  { System.out.println("enter the age of father :");
    age=sc.nextInt();
    if (age<=0)
    {
     throw new AgeException("error");
    }
   }
   void output()
   {
   System.out.println("the age of father is:"+ age);
   }
  }
 
  class son extends father
  {
   int son_age;
   son()
   {}
   Scanner sc=new Scanner(System.in);
   void input() throws AgeException
   { 
   super.getdata();
   
    System.out.println("enter the age of son:");
    
    son_age=sc.nextInt();
    if (son_age<=0 || son_age>age)
    {
     throw new AgeException("error");
     }
    }
     void outputdata()
   {
   	super.output();
  	 System.out.println("the age of son  is:"+ son_age);
   }
    }
     class agemain
     { static int ch;
       public static void main(String xx[])
        {
        do{
        try{
          son s=new son();
         ch=1;
          s.input();
          s.outputdata();
          }
          catch(AgeException e)
          {ch=0;
          System.out.println(e);
          }
         }while(ch==0);
        }
       }  