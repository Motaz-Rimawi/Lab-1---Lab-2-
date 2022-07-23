package Lab2;

public class RandomizedYear {
	public static void main(String[] args) {
		int year = (int)(Math.random()*2023);
		
		if (year%4 ==0 && year%100 != 0 )
			System.out.println(year + " is a leap year!");
		else if (year%400 ==0)
			System.out.println(year + " is a leap year!");
		else 
			System.out.println(year + " is not a leap year!");
	}

}
