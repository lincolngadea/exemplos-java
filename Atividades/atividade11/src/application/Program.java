package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter department's name:");
		String departamentName = sc.nextLine();

		System.out.println("Enter worker data:");

		System.out.print("Name:");
		String workerName = sc.nextLine();

		System.out.print("Level:");
		String workerLevel = sc.nextLine();

		System.out.print("Base salary:");
		double baseSalary = sc.nextDouble();

		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel),baseSalary, new Departament(departamentName));
		
		System.out.println("How many contracts to this worker?");
		int contractsWorker = sc.nextInt();

		for (int i = 0; i < contractsWorker; i++) {
			System.out.println("Enter contract #"+(i+1)+" data:");
			System.out.println();
			
			System.out.print("Date (DD/MM/YYYY):");
			Date contractDate = sdf.parse(sc.next());
			
			System.out.print("Value per hour:");
			double valuePerHour = sc.nextDouble();
			
			System.out.print("Duration (hours):");
			int hours = sc.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.print("Enter month and year to calculate income (MM/YYYY):");
		String monthYear = sc.next();
		
		int month = Integer.parseInt(monthYear.substring(0,2));
		int year = Integer.parseInt(monthYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Departament: " + worker.getDepartament().getName());
		System.out.println("Income for " + monthYear + ": " + String.format("%.2f",worker.income(year, month)));
		
		sc.close();
	}

}
