package Module1;

import java.util.Scanner;

/* This program is find the odd/even numbers*/
public class EvenandOddnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the input number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			if (i % 2 == 0)
				System.out.println("The number is Even number:" + i);
			else
				System.out.println("The number is odd number:" + i);
			i++;

		}

		sc.close();
	}

}
