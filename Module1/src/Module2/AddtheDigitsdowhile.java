package Module2;

import java.util.Scanner;

public class AddtheDigitsdowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the input number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int length = String.valueOf(n).length();
		System.out.println(length);
		int result = 0;
	

			do{
				int temp = (int) (n / (java.lang.Math.pow(10,length)));
				int temp1 = (int) (n % (java.lang.Math.pow(10,length)));
				result = result + temp;
				n=temp1;
				length--;
			
			}while (length >= 0);
			System.out.println("Add the digits result=" +result);
	sc.close();

	}

}
