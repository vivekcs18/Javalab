import java.util.Scanner;
class student
 {String name,usn;
  int n;
  double[] credits,marks;
  float cgpa; 
  
  student()
{ 
  Scanner s=new Scanner(System.in);
  
  System.out.println("enter name:\n");
  name=s.next();
  System.out.println("enter usn:\n");
  usn=s.next();
  System.out.println("enter no. of subjects:\n");

  n=s.nextInt();
  
  marks=new double[n];
  credits=new double[n]; 
  
  System.out.println("enter credits :\n");
  for(int i=0;i<n;i++)
   {System.out.println("subject "+(i+1)+" ");
    credits[i]=s.nextInt();}

    System.out.println("marks :\n");
    for(int j=0;j<n;j++)
   {System.out.println("subject "+(j+1)+" ");
    marks[j]=s.nextInt();} 
}     



void calcsgpa()
{
 float tot=0;
  float totalcred=0;
 int grade;

 for(int i=0;i<n;i++)
 {if(marks[i]>=90)
  grade=10;
  else if (marks[i]>=75 && marks[i]<90)
  grade=9;
  else if (marks[i]>=60 && marks[i]<75)
  grade=8;
  else if (marks[i]>=50 && marks[i]<60)
  grade=7;
  else if (marks[i]>=40 && marks[i]<50)
  grade=6;
  else grade=0;
 
  tot+=grade*credits[i];
  totalcred+=credits[i];}


  cgpa= tot/totalcred;}

void printdetails()
{System.out.println("usn: "+usn);
 System.out.println("name: "+name);
 System.out.println("number of subjects: "+n);
 System.out.println("marks: ");
 
 for(int i=0;i<n;i++)
 {System.out.println(marks[i]);}

 System.out.println("Sgpa: "+cgpa);}
}

class sgpa
{public static void main(String args[])
 {student s1= new student();
  s1.calcsgpa();
  s1.printdetails();

 }} 



