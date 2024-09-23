package basicprogramgtm;

public class Constructor_overloading {

	Constructor_overloading()
	{
		System.out.println("1st");
	}
	
	Constructor_overloading(int a)
	{
		System.out.println("2nd");
	}
	Constructor_overloading(int a, int b)
	{
		System.out.println("3rd");
	}
	
	public static void main(String[] args) {
		
		// we can call objects in both the methods below
	Constructor_overloading c1 = new Constructor_overloading();
      new Constructor_overloading(500);
      new Constructor_overloading(9,18);
	}

}
