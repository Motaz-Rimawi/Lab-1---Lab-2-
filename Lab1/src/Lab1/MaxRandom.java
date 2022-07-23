package Lab1;

public class MaxRandom {
	public static void main(String[] args) {
		int a = (int)(Math.random()*51);
		int b = (int)(Math.random()*51);
		
		if (a>=b)
			System.out.println("The bigger value is a: " + a );
		else 
			System.out.println("The bigger value is b: " + b );

	}

}
