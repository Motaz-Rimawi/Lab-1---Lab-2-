package Lab2;

public class TaxCalculator {
	public static void main(String[] args) {
		int salary = (int)(Math.random()*150000);
		double tax;
		
		System.out.println("Current salary is: " + salary);
		

		if (salary <= 23000) {
			tax = 0.1 * salary;
			salary = salary - (int)(tax) ;
		}
		
		else if (salary > 23000 && salary <= 50000) {
			tax = 0.2 * salary;
			salary = salary - (int)(tax) ;
		}
		
		else if (salary > 50000 && salary <= 100000) {
			tax = 0.3 * salary;
			salary = salary - (int)(tax) ;
		}
		
		else {
			tax = 0.4 * salary;
			salary = salary - (int)(tax) ;
		}
			
		
		System.out.println("Tax calculation is: " + tax);
		System.out.println("Salary after tax is: " + salary);

		
	}

}
