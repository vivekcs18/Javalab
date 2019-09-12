import java.util.*;

class PERSON
{
   Scanner s=new Scanner(System.in);
   int age;
   String name;
   String address;
   PERSON()
   {
      age=0;
      name=null;
      address=null;
   }
   void getdata()
   {
      System.out.println("Enter the age:");
      age=s.nextInt();
      System.out.println("Enter the name:");
      name=s.next();      
      System.out.println("Enter the address:");
      address=s.next(); 
   }
   void print()
   {
      System.out.println("Age: "+age);     
      System.out.println("Name: "+name);    
      System.out.println("Address: "+address);
   }
}

class STUDENT extends PERSON
{
   Scanner s=new Scanner(System.in);
   int rollno,sem;
   STUDENT()
   {
      rollno=0;
      sem=0;
   }
   void getdata()
   {
      super.getdata();
      System.out.println("Enter the Roll No:");
      rollno=s.nextInt();
      System.out.println("Enter the semester:");
      sem=s.nextInt();  
   }
   void print()
   {
      super.print();
      System.out.println("Roll No: "+rollno);     
      System.out.println("Semester: "+sem);  
   }
}

class EXAM extends STUDENT
{
   Scanner s=new Scanner(System.in);
   int marks1,marks2;
   float avg;
   EXAM()
   {
      marks1=0;
      marks2=0;
      avg=0;
   }
   void getdata()
   {
      super.getdata();
      System.out.println("Enter the Marks 1:");
      marks1=s.nextInt();
      System.out.println("Enter the Marks 2:");
      marks2=s.nextInt();  
   }
   void average()
   {
      avg=(marks1+marks2)/2;
   }
   int topper(EXAM s)
   {
      if(s.avg>avg)
          return 1;
      else
          return 2;
   }     
   void print()
   {
      super.print();
      System.out.println("Marks 1: "+marks1);     
      System.out.println("Marks 2: "+marks2);  
   }
}

class demo
{
   public static void main(String args[])
   {
      EXAM s1=new EXAM();
      EXAM s2=new EXAM();
      System.out.println("First student:\n");
      s1.getdata();
      System.out.println("\nSecond student:\n");
      s2.getdata();
      System.out.println("\nStudent 1:");
      s1.print();
      System.out.println("\nStudent 2:");
      s2.print();
      int i=s1.topper(s2);
      if(i==1)
          System.out.println("\nStudent 1 is the topper.");
      else
          System.out.println("Student 2 is the topper.");
   }
}
      

   

 




