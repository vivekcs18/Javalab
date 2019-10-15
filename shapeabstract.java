import java.util.*;
abstract class shape
{int dim1;
 int dim2;
 int dim3;
 shape(int a, int b)
 {dim1=a;
  dim2=b;}

 shape(int c)
 {dim3=c;}

 abstract double printarea();
}

class rectangle extends shape
{
 rectangle(int a, int b)
  {super(a,b);}

 double printarea()
  {
   return dim1*dim2;}}

class triangle extends shape
{
 triangle(int p, int q)
 {super(p,q);}

 double printarea()
 {
  return 0.5*dim1*dim2;}}

class circle extends shape
{
 circle(int r)
 {super(r);}

 double printarea()
 { 
  return 3.14*dim3*dim3;}}

class shapeabstract
 {public static void main(String args[])
  {Scanner s = new Scanner(System.in);
   shape x;
   int a,b,c,d,e,f;
   do
   {System.out.println("MAIN MENU");
    System.out.println("-------------------");
    System.out.println("1.rectangle area:");
    System.out.println("2.triangle area:");
    System.out.println("3.circle area:");
    System.out.println("-------------------");
    System.out.println("enter your choice:");
    f=s.nextInt();
    switch(f)
     {case 1:System.out.println("Enter length of rectangle-");
             c=s.nextInt();
             System.out.println("Enter breadth of rectangle-");
             d=s.nextInt();
             rectangle r = new rectangle(c,d);
             x=r;
             System.out.println("area of triangle="+x.printarea());
             break;
      case 2:System.out.println("Enter base of triangle-");
             a=s.nextInt();
             System.out.println("Enter height of triangle-");
             b=s.nextInt();
             triangle t = new triangle(a,b);
             x=t;
             System.out.println("area of triangle="+x.printarea());
             break;
      case 3:System.out.println("Enter radius of circle-");
             e=s.nextInt();
             circle i = new circle(e);
             x=i;
             System.out.println("area of circle="+x.printarea());
             break;
      case 4:System.exit(0);
             break;}}while(f!=4);}}


   
      
   
   
   



