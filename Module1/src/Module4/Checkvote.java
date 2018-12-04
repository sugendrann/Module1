package Module4;

import java.util.Scanner;

public class Checkvote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age:");
		int age = sc.nextInt();
		if (age >= 18)
			System.out.println("You are eligible for voting");
		else
			System.out.println("You are not eligible for voting");
		sc.close();

	}

}
