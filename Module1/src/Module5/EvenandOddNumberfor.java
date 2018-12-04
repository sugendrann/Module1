package Module5;

import java.util.Scanner;

public class EvenandOddNumberfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the input number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0)
				System.out.println("The number is Even number:" + i);
			else
				System.out.println("The number is odd number:" + i);

		}

		sc.close();

	}

}
