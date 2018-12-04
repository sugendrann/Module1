package Module2;

import java.util.Scanner;

public class ReversetheDigitsdowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the input number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String result = "";
		int length = String.valueOf(n).length();
		do
		{
			int temp = (int) (n / (java.lang.Math.pow(10,(length-1))));
			int temp1 = (int) (n % (java.lang.Math.pow(10,length-1)));
			result =  temp+result;
			n=temp1;
			length--;
<<<<<<< HEAD
		
		}while(length>0);
			System.out.println("Reverse the digits result=" +result);
		sc.close();
=======
		}while(length>0);
		System.out.println("Reverse the digits result=" +result);
		sc.close();

>>>>>>> branch 'master' of https://github.com/sugendrann/Module1.git
	}

}
