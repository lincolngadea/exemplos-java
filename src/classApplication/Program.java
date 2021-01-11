package classApplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x,y;
		
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Enter the measures of Triangule X:");
		
		x.A = sc.nextDouble();
		x.B = sc.nextDouble();
		x.C = sc.nextDouble();
		
		System.out.println("Enter the measures of Triangule Y:");
		
		y.A = sc.nextDouble();
		y.B = sc.nextDouble();
		y.C = sc.nextDouble();
		
		double p = (x.A + x.B + x.C)/2.00;
		double areaX = Math.sqrt(p *(p -x.A)*(p-x.B)*(p-x.C));
		
		p = (y.A + y.B + y.C)/2.00;
		double areaY = Math.sqrt(p *(p -y.A)*(p-y.B)*(p-y.C));
		
		System.out.printf("Triangule X area: %.4f%n", areaX);
		System.out.printf("Triangule Y area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area: X");
		}else {
			System.out.println("Larger area: Y");
		}	
		
		sc.close();
	}

}
