package Module5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddtheDigitsfor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enetr the input numbers:");
		InputStreamReader obj = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(obj);
		int n = Integer.parseInt(br.readLine());
		int length = String.valueOf(n).length();
		int result = 0;
		for(int i=length-1;i>=0;i--)
		{
			int temp1 = (int) (n / java.lang.Math.pow(10, i));
			int temp2 = (int) (n % java.lang.Math.pow(10, i));
			result = result + temp1;
			n = temp2;
		}
		System.out.println("Add the digits result= "+result);
		br.close();
		

	}

}
