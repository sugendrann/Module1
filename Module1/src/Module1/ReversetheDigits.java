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
		String result = "";
	
		/*while(i<=length)
		{
			int temp = (int) (n / (java.lang.Math.pow(10,i)));
			int temp1 = (int) (n % (java.lang.Math.pow(10,i)));
			result = (int) (result+(temp1*(java.lang.Math.pow(10,length)));
			
		}
		
		
		
		while (length >= 0) {
			int temp2 = (int) (n % (java.lang.Math.pow(10,--length)));
			int temp1 = (int) (n % (java.lang.Math.pow(10,i)));
			result = result + temp1 * (int) (java.lang.Math.pow(10,length));
			
			
			i++;
		
		}
		System.out.println("Add the digits result=" +result);
		sc.close();*/
	

		while (length > 0) {
			int temp = (int) (n / (java.lang.Math.pow(10,(length-1))));
			int temp1 = (int) (n % (java.lang.Math.pow(10,length-1)));
			result =  temp+result;
			n=temp1;
		length--;
		
		}
		System.out.println("Reverse the digits result=" +result);
sc.close();

	
		
	}

}
