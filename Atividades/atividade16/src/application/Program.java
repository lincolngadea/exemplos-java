package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers:");
		Integer numberPayers = sc.nextInt();

		for (int i = 1; i <= numberPayers; i++) {
			System.out.println("Taxpayer #" + i + " data:");

			System.out.print("Individual or company(i/c)?");
			char type = sc.next().charAt(0);

			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Anual Income:");
			Double anualIncome = sc.nextDouble();

			switch (type) {
			case 'i':
				System.out.print("Health expenditures:");
				Double healthExp = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExp));
				break;
			case 'c':
				System.out.print("Number of Employees:");
				Integer employees = sc.nextInt();
				list.add(new Company(name, anualIncome, employees));
				break;
			}

		}

		System.out.println();
		System.out.println();
		System.out.println("TAXES PAID:");

		Double totalTax = 0.0;
		for (TaxPayer txp : list) {
			System.out.println(txp.getName() + ":" + txp.calcTax());
			totalTax += txp.calcTax();
		}

		System.out.print("TOTAL TAXES: " + totalTax);

		sc.close();
	}

}
