package basicprogramgtm;

public class Continue_keyword {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++)
		{
			if(i==99)
			{
				continue;  // to skip the particular iteration
			}
			System.out.println(i);
		}

	}

}
