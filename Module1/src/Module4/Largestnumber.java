package Module4;

import java.util.Scanner;

public class Largestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your input numbers:");
		int a[] = new int[3];
		for(int i=0;i<a.length;i++)
		a[i] = sc.nextInt();
		if((a[0]<a[1])&(a[0]<a[2]))
			System.out.println(a[1]+" and "+a[2]+" largest numbers");
		else if ((a[1]<a[0])&(a[1]<a[2]))
			System.out.println(a[0]+" and "+a[2]+" largest numbers");
		else 
			System.out.println(a[0]+" and "+a[1]+" largest numbers");
		sc.close();
	

	}

}
