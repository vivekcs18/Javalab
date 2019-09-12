import java.util.*;

class twod {
double l,b,a;

twod()
{l=0.0;
 b=0.0;
 a=0.0;}

 void getdata()
{Scanner s = new Scanner(System.in);
 System.out.println("enter the length\n");
 l=s.nextDouble();
 System.out.println("enter the breadth\n");
 b=s.nextDouble();}

 void computearea()
{a=l*b;}

void printdata()
{System.out.println("\nlength: "+l);
 System.out.println("\nbreadth: "+b);
 System.out.println("area= \n"+a);}     
     }

class threed extends twod{

double v,h;

threed()
{v=0.0;
 h=0.0;}

void getdata()
{super.getdata();
 Scanner in = new Scanner(System.in);
 System.out.println("enter height\n");
 h=in.nextDouble();}

void computevolume()
{v=l*b*h;}


void printdata()
{super.printdata();
 System.out.println("height= "+h);
 System.out.println("volume= "+v);}  
                                      }

public class inheritancedemo{
 public static void main(String args[]){
 
  threed ob = new threed();

  ob.getdata();
  ob.computearea();
  ob.computevolume();
  ob.printdata();}}
 
 
 

