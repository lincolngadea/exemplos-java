import java.util.Locale;
import java.util.Scanner;

public class Raio {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		double area;
		double pi;
		double raio;
		
		Scanner sc = new Scanner(System.in);
		
		pi = 3.14159;
		
		raio = sc.nextDouble();
		
		area = pi * raio * raio;
		
		System.out.printf("A=%.4f%n",area);
		
		sc.close();
	}
}
