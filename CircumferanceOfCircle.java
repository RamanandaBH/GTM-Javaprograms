package basicprogramgtm;

import java.util.Scanner;

public class CircumferanceOfCircle {

	public static void main(String[] args) // 2pir
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the value of r");
		int r = s1.nextInt();
		double pi = Math.PI;
		System.out.println("Circumferance of Circle is " +2*pi*r);

	}

}
