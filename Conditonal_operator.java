package basicprogramgtm;

public class Conditonal_operator {

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		if(a==b && a==10) // conditon is not satisfying will not get output
		{
			System.out.println("1");
		}
		if(a==b || a==10) // conditon is satisfying will get output
		{
			System.out.println("Or operator");
		}
		if(!(a==b || a==10)) // Not operator is reversing the output
		{
			System.out.println("Or and Not operator");
		}
		if(a<b && a==10)
		{
			System.out.println("2"); // will get output
		}
	}

}
