package Module1;

import java.util.Scanner;

public class ReversetheDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the input number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int length = String.valueOf(n).length();
		System.out.println(length);
		int result = 0;
		int i = 1;
		while (length > 0) {
<<<<<<< HEAD
			int temp = (int) (n / (java.lang.Math.pow(10,(length-1))));
			int temp1 = (int) (n % (java.lang.Math.pow(10,length-1)));
			result =  temp+result;
			n=temp1;
		length--;
		
		}
		System.out.println("Reverse the digits result=" +result);
sc.close();
=======
>>>>>>> branch 'master' of https://github.com/sugendrann/Module1.git

			int temp1 = (int) (n % (java.lang.Math.pow(10, i)));
			result = temp1 + result * 10;
			n = n / 10;
			length--;

		}

		System.out.println("Reverse the digits result=" + result);
		sc.close();

	}

}
