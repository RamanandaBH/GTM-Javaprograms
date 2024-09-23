package basicprogramgtm;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("please enter 1 for chrome");
		System.out.println("please enter 2 for mozilla");
		System.out.println("please enter 3 for edge");
		int input = s1.nextInt();
		switch(input)
		{
		case 1 : System.out.println("Launching chrome browser");
					break; // break statement is not mandatory but highly recomended
		case 2 : System.out.println("Launching chrome mozilla");
		            break;  
		case 3 : System.out.println("Launching chrome edge");
        		    break;  
        
        default:
        System.out.println(" Your selection is wrong, please try again");
		}
	}

}
