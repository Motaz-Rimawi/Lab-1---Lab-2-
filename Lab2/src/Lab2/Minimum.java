package Lab2;

public class Minimum {
	public static void main(String[] args) {
		
		int a = (int)(Math.random()*51);
		int b = (int)(Math.random()*51);
		int c = (int)(Math.random()*51);
		
		System.out.printf("a=%d b=%d c=%d \n" , a , b , c);

		if (a<=b)
			if(a<=c)
				System.out.println("The minimum value is a:" + a);
			else
				System.out.println("The minimum value is c:" + c);
		else if (b<=a)
			if(b<=c)
				System.out.println("The minimum value is b:" + b);
			else
				System.out.println("The minimum value is c:" + c);
		else
			System.out.println("The minimum value is c:" + c);
		
		
	}
}
