package Module3;

import java.util.Scanner;

public class Exampleforchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter your character:");
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		char d = sc.next().charAt(0);
		if(c==d)
			System.out.println("Both"+c+" and "+d+"characters are same");
		else if(c>d)
			System.out.println(c+" is greater than "+d);
		else
			System.out.println(d+" is greater than "+c);
		sc.close();
			
		
		
		
		

	}

}
