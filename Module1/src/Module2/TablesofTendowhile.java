package Module2;

import java.util.Scanner;

public class TablesofTendowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the input number for find the table:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int value;
		System.out.println("The table of "+n+" upto 10:");
		int i = 1;
		do
		{
			value=n*i;
		
		   System.out.println(n+" * "+i+"=" +value);
		   i++;
		}while (i<=100);
		sc.close();

	}

}
