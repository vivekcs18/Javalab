class multigen<t1,t2>
{
	t1 a;
	t2 b;
	multigen( t1 a1, t2 b2)
	{
		a=a1;
		b=b2;
	}
	t1 rettype1()
	{
		return a;
	}
	t2 rettype2()
	{
		return b;
	}
	void display()
	{
		System.out.println(a +" "+ b);
	}
}
class mgendemo
{
	public static void main(String args[])
	{
		multigen<Integer,Character> m1= new multigen<Integer,Character>(10,'+');
		multigen<String,Boolean> m2=new multigen<String,Boolean>("hi ",true);
		int c=m1.rettype1();
		char x=m1.rettype2();
		System.out.println(c+" "+x);
		String c1=m2.rettype1();
		Boolean x1=m2.rettype2();
		System.out.println(c1+x1);
		m1.display();
		m2.display();
	}
}