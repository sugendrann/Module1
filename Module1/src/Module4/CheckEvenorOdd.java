package Module4;

import java.util.Scanner;

public class CheckEvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number:");
		int number = sc.nextInt();
		if(number%2==0)
			System.out.println("The number is even");
		else
			System.out.println("The number is odd");
		sc.close();

	}

}
