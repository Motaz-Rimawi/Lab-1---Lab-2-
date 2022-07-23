package Lab2;

public class Random {
	public static void main(String[] args) {
		int val = (int)(Math.random()*101);
		
		if (val > 50)
			System.out.println("Big!");
		else if (val < 50)
			System.out.println("Small!");
		else
			System.out.println("Bingo!");

	}
}
