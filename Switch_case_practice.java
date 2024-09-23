package basicprogramgtm;

import java.util.Scanner;

public class Switch_case_practice {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter 1 for launch chrome");
		int input = s1.nextInt();
		switch(input) 
		{
		case 1 : System.out.println("launch chrome browser");
		         break;
		case 2 : System.out.println("launch safari browser");
		         break;
		case 3 : System.out.println("launch mozilla browser");  
		         break;
		default : System.out.println("Your input is invalid");
		}
		
	}

}
