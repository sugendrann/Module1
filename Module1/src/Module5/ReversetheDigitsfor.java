package Module5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversetheDigitsfor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enetr the input numbers:");
		InputStreamReader obj = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(obj);
		int n = Integer.parseInt(br.readLine());
		int length = String.valueOf(n).length();
		int result = 0;
		int j = 1;
		for (int i = length - 1; i >= 0; i--) {

			int temp1 = (int) (n % java.lang.Math.pow(10, j));
			result = result * 10 + temp1;
			n = n / 10;
		}
		System.out.println("Reverse the digits result= " + result);
		br.close();

	}

}
