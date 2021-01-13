package Default;

import java.util.Locale;
import java.util.Scanner;

import entities.Worker;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Worker worker = new Worker();
		
		
		System.out.println("Name:");
		worker.name = sc.nextLine();
		
		System.out.println("Gross Salary:");
		worker.grossSalary = sc.nextDouble();
		
		System.out.println("Tax:");
		worker.tax =sc.nextDouble();
		
		System.out.println("Percentage:");
		double percentage = sc.nextDouble();
		
		System.out.println("Worker:"+worker);
		
		worker.increaseSalary(percentage);
		
		System.out.printf("Which percentage to increase salary? %.1f%n",percentage);	
		
		System.out.println("Updated:"+worker);
		
		sc.close();

	}

}
