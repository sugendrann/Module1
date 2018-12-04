package Module5;

import java.util.Scanner;

public class TablesofTenfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the input number for find the table:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int value;
		System.out.println("The table of " + n + " upto 10:");
		for (int i = 1; i <= 100; i++) {
			value = n * i;
			System.out.println(n + " * " + i + "=" + value);
		}
		sc.close();

	}

}
