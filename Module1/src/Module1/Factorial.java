package Module1;

import java.util.Scanner;
/* This program is to find the factorial for the given number*/
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the input number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fact = 1;
		int i = 1;
		while ( i <= n) {
			fact*=i;
			i++;
		}
		System.out.println("The factorial for the given number is "+fact);
		sc.close();

	}

}
