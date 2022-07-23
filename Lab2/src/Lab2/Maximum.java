package Lab2;

public class Maximum {
	public static void main(String[] args) {
		
		int a = (int)(Math.random()*51);
		int b = (int)(Math.random()*51);
		int c = (int)(Math.random()*51);
		
		System.out.printf("a=%d b=%d c=%d \n" , a , b , c);

		if (a>=b)
			if(a>=c)
				System.out.println("The maximum value is a:" + a);
			else
				System.out.println("The maximum value is c:" + c);
		else if (b>=a)
			if(b>=c)
				System.out.println("The maximum value is b:" + b);
			else
				System.out.println("The maximum value is c:" + c);
		else
			System.out.println("The maximum value is c:" + c);
		
		
		/*
		 Another way of comparing:
		 
		 if (a >= b && a>=c)
			System.out.println(a);
		else if (b >= a && b>=c)
			System.out.println(b);
		else 
			System.out.println(c);
		 */

	}

}
