import java.util.*;

class book
{ String name,author;
  int pages;
  double price;

 book()
 {name=null;
  author=null;
  pages=0;
  price=0.0;}

void setdata()
{Scanner s= new Scanner(System.in);
 System.out.println("enter book name:");
 name=s.next();
 System.out.println("enter author name:");
 author=s.next();
 System.out.println("enter no. of pages:");
 pages=s.nextInt(); 
 System.out.println("enter price:");
 price=s.nextDouble(); }

public String toString()
{String str=("name: "+name+"\nauthor :"+author+"\npages: "+pages+"\nprice: "+price);
 return str;}

void getdata()
{String str = toString();
 System.out.println(str);}
                              }

public class bookdemo
{public static void main(String args[])
 {Scanner ins = new Scanner(System.in);
  System.out.println("enter number of books:");
  int n= ins.nextInt();
  
  book b[]=new book[n];

 for(int i=0;i<n;i++)
 {b[i]=new book();}
 
 for(int j=0;j<n;j++)
 {System.out.println("-----enter the details of book "+(j+1)+" :-----");
  b[j].setdata();}

 for(int k=0;k<n;k++)
 {System.out.println("the details:");
  b[k].getdata();}}}
