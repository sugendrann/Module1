package Module5;

import java.util.Scanner;

public class Fibonaccifor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the input number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp1 = 0;
		int temp2 = 1;
		System.out.print(temp1+" "+temp2+" ");
		int temp3 = 0;
		for(int i=1;i<=n;i++)
		{
			while(n>temp3)
			{
			temp3 = temp1+temp2;
			temp1 = temp2;
			temp2 = temp3;
			if(temp3<=n)
			System.out.print(temp3+" ");
			else
			break;
			}
			sc.close();
		}
		

	}

}
