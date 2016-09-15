package basicprogram;

public class addition {

	 int a,b,c;
	

	public static void main (String args[])
	{
		//object creation//
		addition a1=new addition();
		a1.a=10;
		a1.b=20;
		a1.c=a1.a+a1.b;
	addition a2=new addition();
		a2.a=40;
		a2.b=60;
		a2.c=a2.a+a2.b;
	System.out.println(a1.c);
	System.out.println(a2.c);
		
		
	}
}
