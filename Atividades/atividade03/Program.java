import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.print("Name:");		
		student.name = sc.nextLine();
		
		System.out.print("Nota 01:");
		student.note1 = sc.nextDouble();

		System.out.print("Nota 02:");
		student.note2 = sc.nextDouble();
		
		System.out.print("Nota 03:");
		student.note3 = sc.nextDouble();
		
		student.verifyApproval();
		
		
		sc.close();		
	}

}
