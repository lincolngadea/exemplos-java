import java.util.Locale;
import java.util.Scanner;

import utils.BankAccount;

public class AccountProgram {

	public static void main(String[] args) {
		
		BankAccount bankAccount;
		double deposit;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number:");
		String accountNumber = sc.next();		
		
		System.out.print("Enter account Holder:");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit? (y/n)");
		char firstDeposit = sc.next().charAt(0);
	
		if(Character.toUpperCase(firstDeposit) == 'Y') {
			System.out.print("Enter initial deposit:");
			deposit = sc.nextDouble();
			bankAccount = new BankAccount(accountNumber, holder, deposit);
		}else {
			bankAccount = new BankAccount(accountNumber, holder);
		}
		
		System.out.println();
		System.out.print("Account Data:");
		System.out.print(bankAccount);
		
		System.out.println();
		System.out.print("Enter deposit value:");
		
		deposit = sc.nextDouble();
		bankAccount.deposit(deposit);
		
		System.out.println();
		System.out.print("Update Account Data:");
		System.out.print(bankAccount);
		
		System.out.println();
		System.out.print("Enter a withdraw value:");
		
		double withdraw = sc.nextDouble();
		bankAccount.withdraw(withdraw);
		
		System.out.println();
		System.out.print("Update Account Data:");
		System.out.print(bankAccount);
		
		sc.close();
	}

}
