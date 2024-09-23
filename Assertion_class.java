package basicprogramgtm;

public class Assertion_class {

	public static void main(String[] args) 
	{
		int age=17;
		assert age>=18: "sorry the age of the person is not as expected";
		
		// for the first time run with assertion keyword -ea in run cofiguration
		
		System.out.println("The age of person is " + age);
		

	}

}
