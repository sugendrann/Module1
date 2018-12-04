package Module3;

import java.util.Scanner;

public class Arithmeticusingdatatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your input number by short datatype:");
		Scanner sc = new Scanner(System.in);
		
		short a = sc.nextShort();
		short b = sc.nextShort();
		Add1 add = new Add1(a,b);
		add.add();
		
		System.out.println("Enter your input number by int datatype:");
		int c = sc.nextInt();
		int d = sc.nextInt();
		Subtraction1 sub = new Subtraction1(c,d);
		sub.Sub();
		
		System.out.println("Enter your input number by long datatype:");
		long e = sc.nextLong();
		long f = sc.nextLong();
		Multiplication1 mul = new Multiplication1(e,f);
		mul.mul();
		
		System.out.println("Enter your input number by float datatype:");
		float g = sc.nextFloat();
		float h = sc.nextFloat();
		Division1 div = new Division1(g,h);
		div.div();
		
		System.out.println("Enter your input number by double datatype:");
		double i = sc.nextDouble();
		double j = sc.nextDouble();
		Modulus1 mod = new Modulus1(i,j);
		mod.mod();
		
		
		Increment1 inc = new Increment1(a,b);
		inc.inc();
		Decrement1 dec = new Decrement1(a,b);
		dec.dec();
		sc.close();
		

	}

}

class Add1
{
	short a,b;
	Add1(short a,short b)
	{
		this.a=a;
		this.b=b;
	}
	void add()
	{
		boolean o = true;
		if(o==true)
		System.out.println("Addition of byte result:"+(a+b));
		else
		System.out.println("Addition method is not complete ");
	}
}
class Subtraction1
{
	int c,d;
	Subtraction1(int c,int d) {
		this.c=c;
		this.d=d;
	}
	void Sub()
	{
		System.out.println("Subtraction of byte result:"+(c-d));
	}
}
class Multiplication1
{
	long e,f;
	Multiplication1(long e,long f) {
		this.e=e;
		this.f=f;
	}
	void mul()
	{
		System.out.println("Multiplication of byte result:"+(e*f));
	}
}
class Division1
{
	float g,h;
	Division1(float g,float h) {
		this.g=g;
		this.h=h;
	}
	void div()
	{
		System.out.println("Division of byte result:"+(g/h));
	}
}
class Modulus1
{
	double i,j;
	Modulus1(double i,double j) {
		this.i=i;
		this.j=j;
	}
	void mod()
	{
		System.out.println("Modulus of byte result:"+(i%j));
	}
}
class Increment1 extends Add1
{
	Increment1(short a,short b) {
		super(a,b);
	}
	void inc()
	{
		System.out.println("Prefix Increment of byte result:"+(a++));
		System.out.println("Prefix Increment of byte result:"+(++a));
		System.out.println("Postfix Increment of byte result:"+(b++));
		System.out.println("Postfix Increment of byte result:"+(++b));
	}
}
class Decrement1 extends Add1
{
	Decrement1(short a,short b) {
		super(a,b);
	}
	void dec()
	{
		System.out.println("Prefix Decrement of byte result:"+(a--));
		System.out.println("Prefix Decrement of byte result:"+(--a));
		System.out.println("Postfix Decrement of byte result:"+(b--));
		System.out.println("Postfix Decrement of byte result:"+(--b));
	}
}


