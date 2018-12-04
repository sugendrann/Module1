package Module4;

import java.util.Scanner;

public class Checknumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your input number:");
		int number = sc.nextInt();
		if (number > 0)
			System.out.println("The number is positive");
		else if (number < 0)
			System.out.println("The number is negative");
		else
			System.out.println("The number is zero");

		sc.close();

	}

}
