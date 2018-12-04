package Module2;

import java.util.Scanner;

public class Factorialdowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the input number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fact = 1;
		int i = 1;
		do {
			fact*=i;
			i++;
		}while ( i <= n);
		System.out.println("The factorial for the given number is "+fact);
		sc.close();

	}

}
