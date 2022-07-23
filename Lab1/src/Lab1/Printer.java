package Lab1;

public class Printer {
	public static void main(String[] args) {
		String part1 = "There will be" ; 
		int visitors = 5 ; 
		String part2 = "people for dinner";
		//System.out.println(part1 + " " + visitors+2 + " " + part2); in this way visitors and number 2 will be concatenated and not added 
		//System.out.println(part1 + " " + (visitors+2) + " " + part2); in this way the brackets mean that the argument inside them is an arithmetic operation 
		System.out.printf("%s" +  " %d" + " " + "%s" , part1,visitors+2,part2); //other way to print the desired sentence using printf format

	}
	
}
