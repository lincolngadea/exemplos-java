import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class PriceDollar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor:");
		double value = sc.nextDouble();
		
		System.out.println("Cotação atual:");
		double atualPrice = sc.nextDouble();
		
		double valueConverted = CurrencyConverter.price(value, atualPrice);
		
		System.out.printf("What is the dollar price? %.2f%n",atualPrice);
		System.out.printf("Hou many dollars will be bought: %.2f%n",value);
		System.out.printf("Amount to be paid in reais = %.2f%n",valueConverted);
		
		sc.close();

	}

}
