package basicprogramgtm;

public class Overloading_main_method {
     
	Overloading_main_method() // constructor method name should always be same as class name
	{
		System.out.println("constructor is called in main method");
	}
	public static void main(String[] arg )
	{
		System.out.println("Main method");
		Overloading_main_method o1 = new Overloading_main_method(); // called non static main method 
		o1.main();
		main("Ramananda", 'M');
		new Overloading_main_method();	
	}
	public  void main() // non static main method 
	{
		System.out.println("Main method with no arguments");
	}
	public static void main(String name, char gender) 
	{
       System.out.println("Main method with string and gender ");
	}
}
