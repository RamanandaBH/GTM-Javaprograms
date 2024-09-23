package basicprogramgtm;
class NonstaticInheritance
{
	static int a = 20;
	static int b = 10;
	void add ()
	{
		int add = a+b;
		System.out.println(add);
	}
	void sub() {
		int sub = a-b;
		System.out.println(sub);
	}
	
}
public class SingleInheritance_Nonstatic extends NonstaticInheritance

{
    void mul()
    {
    	int mul = a*b;
    	System.out.println(mul);
    }
	public static void main(String[] args) {
		
		SingleInheritance_Nonstatic s1 = new SingleInheritance_Nonstatic();
		
		s1.add();
		s1.sub();
		s1.mul();
		

	}

}
