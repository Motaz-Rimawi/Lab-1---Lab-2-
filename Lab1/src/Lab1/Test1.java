package Lab1;

public class Test1 {
	public static void main(String[] args) {
		int time = (int)(Math.random()*351);
		
		System.out.println("Time of the movie in minutes is: " + time);
		System.out.println("Time of the movie in Hours and minutes is: " + time/60 + ":" + time%60);
		
	}

}
