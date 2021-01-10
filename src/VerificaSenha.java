import java.util.Locale;
import java.util.Scanner;

public class VerificaSenha {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int senhaDigitada, senhaSalva = 1234;
		
		System.out.println("Informe a Senha:");
		
		senhaDigitada = sc.nextInt();
		
		while(senhaDigitada != senhaSalva) {
			System.out.println("SENHA INVÁLIDA");
			System.out.println("Informe a Senha:");
			senhaDigitada = sc.nextInt();
		}
		System.out.println("ACESSO PERMITIDO");
		sc.close();
	}
}
