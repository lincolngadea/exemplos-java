package utils;

public class BankAccount {
	
	private String accountNumber;
	private String holder;
	private double balance;
	
	public BankAccount(String accountNumber, String holder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public BankAccount(String accountNumber, String holder) {
		this.accountNumber = accountNumber;
		this.holder = holder;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {		
		this.balance += amount;		
	}
	
	public void withdraw(double amount) {
		this.balance -= amount + 5;
	}
	
	public String toString() {
		return "Account "
				+ accountNumber
				+ ", Holder: "
				+ holder.toUpperCase()
				+ ", Balance: "
				+ String.format("%.2f",balance);
	}

	
	
	
	
	
	
}



//o número da conta nunca pode ser alterado OK
//o nome do titular pode ser alterado OK

//o saldo da conta não pode ser alterado diretamente, deve depender de uma transação para isso.OK
//o banco cobra $5,00 por saque OK

//a conta pode ficar com saldo negativo se o saldo não for suficiente.OK

/**
 * O programa terá as seguintes funcionalidades:
 * Cadastrar conta com ou sem o valor do depósito inicial
 * Realizar depósito
 * Realizar Saque
 * Mostrar os dados da conta após cada operação
 */