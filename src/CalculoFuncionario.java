import java.util.Locale;
import java.util.Scanner;

public class CalculoFuncionario {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double ht,vh,sl;
		int num;
		
		num = sc.nextInt();
		ht = sc.nextDouble();
		vh = sc.nextDouble();
		
		sl = ht*vh;
		
		System.out.println("NUMBER = "+num);
		System.out.printf("SALARY = U$ %.2f%n",sl);
		sc.close();
	}
}
