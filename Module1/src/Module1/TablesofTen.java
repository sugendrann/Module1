package Module1;

import java.util.Scanner;

public class TablesofTen {
/* This program is to find the tables of any number*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the input number for find the table:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int value;
		System.out.println("The table of "+n+" upto 10:");
		int i = 1;
		while (i<=100)
		{
			value=n*i;
		
		   System.out.println(n+" * "+i+"=" +value);
		   i++;
		}
		sc.close();

	}

}
