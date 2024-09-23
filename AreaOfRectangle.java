package basicprogramgtm;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of b");
		double b = s1.nextDouble();
		System.out.println("Enter the value of h");
		double h = s1.nextDouble();
		System.out.println("Area of Sqaure is " + b*h);

	}

}
