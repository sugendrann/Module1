package Module1;

import java.util.Scanner;

/* This program is for fibonacci series*/

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the input number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp1 = 0;
		int temp2 = 1;
		System.out.print(temp1+" "+temp2+" ");
		int temp3 = 0;
		while(n>temp3)
		{
			temp3 = temp1+temp2;
			temp1 = temp2;
			temp2 = temp3;
			System.out.print(temp3+" ");
		}
		sc.close();
	}

}
