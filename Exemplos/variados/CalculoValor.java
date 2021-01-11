import java.util.Locale;
import java.util.Scanner;

public class CalculoValor {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int nP1, nP2;
		double vlrP1, vlrP2, vlrPgt;
		
		
		nP1 = sc.nextInt();
		vlrP1 = sc.nextDouble();
		
		nP2 = sc.nextInt();
		vlrP2 = sc.nextDouble();
		
		vlrPgt = (vlrP1*nP1)+(vlrP2*nP2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",vlrPgt);	
		
		sc.close();
	}
}
