package Module5;

import java.util.Scanner;

public class Factorialfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the input number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= n; i++)
			fact *= i;
		System.out.println("The factorial for the given number is " + fact);
		sc.close();

	}

}
