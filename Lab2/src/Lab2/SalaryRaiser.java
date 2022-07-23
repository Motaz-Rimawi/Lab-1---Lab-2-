package Lab2;

public class SalaryRaiser {
	public static void main(String[] args) {
		int salary = 5000 + (int)(Math.random()*1000);
		
		System.out.println("Current salary is: " + salary);

		if (salary < 6000)
			salary = salary + (int)(0.1*salary) ;
		else
			salary = salary + (int)(0.05*salary) ;
		
		System.out.println("Salary after raising is: " + salary);

		
	}

}
