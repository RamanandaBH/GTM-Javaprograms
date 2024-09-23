package basicprogramgtm;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		
	    Scanner s1 = new Scanner(System.in);
	    System.out.println("Enter the value of r");
	    int r = s1.nextInt();
		double pi = Math.PI;
		System.out.println("Area of Circle is " + pi*r*r);
	}
}
