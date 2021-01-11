import java.util.Locale;
import java.util.Scanner;

public class ValorFlutuante {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A,B,C,area,pi = 3.14159;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		area = (A*C)/2;
		
		System.out.printf("ÁREA DO TRINÂNGULO = %.3f%n",area);
		
		area = pi * Math.pow(C,2);
		
		System.out.printf("ÁREA DO CÍRCULO = %.3f%n",area);
		
		area = ((A+B)*C)/2;
		
		System.out.printf("ÁREA DO TRAPÉZIO = %.3f%n",area);
		
		area = B*B;
		
		System.out.printf("ÁREA DO QUADRADO = %.3f%n",area);
		
		area = A*B;
		
		System.out.printf("ÁREA DO RETÂNGULO = %.3f%n",area);
		
		sc.close();
	}
}
