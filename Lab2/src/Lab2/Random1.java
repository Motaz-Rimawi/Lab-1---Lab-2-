package Lab2;

public class Random1 {
	public static void main(String[] args) {
		int val = (int)(Math.random()*101);
		
		
		if (val <= 50)
			System.out.println("Small!");
		else
			System.out.println("Big!");
		
		if (val%2 == 0)
			System.out.println("Even!");
		else 
			System.out.println("Odd!");

	}
}
