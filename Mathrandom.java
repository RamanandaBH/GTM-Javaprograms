package basicprogramgtm;

public class Mathrandom {
   static final double pivalue = Math.PI;
  static double radius = Math.random();
	public static void main(String[] args) {
	/*	for(int i=1;i<=10;i++)
		{
			System.out.println(Math.random());
		} */
	      double area = pivalue*radius*radius;
	      System.out.println("area of circle " +  area);
	}
}
