import java.util.Scanner;

public class Soma {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1;
		int n2;
		int soma;
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
				
		soma = n1+n2;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
		
		
	}
}
