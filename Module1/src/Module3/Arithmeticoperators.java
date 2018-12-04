package Module3;

import java.util.Scanner;

public class Arithmeticoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter your input number:");
		Scanner sc = new Scanner(System.in);
		byte a = sc.nextByte();
		byte b = sc.nextByte();
		Add add = new Add(a,b);
		add.add();
		Subtraction sub = new Subtraction(a,b);
		sub.Sub();
		Multiplication1 mul = new Multiplication1(a,b);
		mul.mul();
		Division1 div = new Division1(a,b);
		div.div();
		Modulus mod = new Modulus(a,b);
		mod.mod();
		Increment inc = new Increment(a,b);
		inc.inc();
		Decrement dec = new Decrement(a,b);
		dec.dec();
		sc.close();
		

	}

}

class Add
{
	byte a,b;
	Add(byte a,byte b)
	{
		this.a=a;
		this.b=b;
	}
	void add()
	{
		System.out.println("Addition of byte result:"+(a+b));
	}
}
class Subtraction extends Add
{
	Subtraction(byte a,byte b) {
		super(a,b);
	}
	void Sub()
	{
		System.out.println("Subtraction of byte result:"+(a-b));
	}
}
class Multiplication extends Add
{
	Multiplication(byte a,byte b) {
		super(a,b);
	}
	void mul()
	{
		System.out.println("Multiplication of byte result:"+(a*b));
	}
}
class Division extends Add
{
	Division(byte a,byte b) {
		super(a,b);
	}
	void div()
	{
		System.out.println("Division of byte result:"+(a/b));
	}
}
class Modulus extends Add
{
	Modulus(byte a,byte b) {
		super(a,b);
	}
	void mod()
	{
		System.out.println("Modulus of byte result:"+(a%b));
	}
}
class Increment extends Add
{
	Increment(byte a,byte b) {
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
class Decrement extends Add
{
	Decrement(byte a,byte b) {
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
