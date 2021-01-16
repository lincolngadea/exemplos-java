import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Lists {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered?");
		Integer employees = sc.nextInt();

		for (int i = 0; i < employees; i++) {
			System.out.println("Employee:" + (i + 1));

			System.out.print("Id:");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			sc.nextLine();

			System.out.print("Name:");
			String name = sc.nextLine();

			System.out.println("Salary:");
			Double salary = sc.nextDouble();

			list.add(new Employee(id, name, salary));
		}

		System.out.print("Enter the employee id that will have salary increase :");
		int id = sc.nextInt();

		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This ID dont exists!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		
			System.out.println("Listofemployees:");
			for(Employee x : list) {
				System.out.println(x);
			}
			
		sc.close();
	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
