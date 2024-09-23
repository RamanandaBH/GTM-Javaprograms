package basicprogramgtm;
class one  // super class or parent class
{
	static int a = 10;
	static int b = 5;
 	static void add() 
 	{
 		int add = a+b;
 		System.out.println(add);
 	}
 	 static void sub() 
 	{
 		 int sub = a-b;
 		System.out.println(sub);
 	}
}
public class SinglelevelInheritance extends one//sub class or child class
{
	
 static void mul() 
   {
	 int mul = a*b;
	System.out.println(mul);
	}
static void div()
{
	int div = a/b;
	System.out.println(div);
}
public static void main(String[] args) 
{
	add();
	sub();
	mul();
	div();
} 
	

}
