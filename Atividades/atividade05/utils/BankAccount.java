package utils;

public class BankAccount {
	
	private String accountNumber;
	private String cardHolderName;
	private double deposit;
	private double balance;
	private double withdraw;
	
	private static final double WITHDRAW_TAX = 5.00;
	
	public BankAccount(String accountNumber, String cardHolderName, double balance, double withdraw) {
		
		this.accountNumber = accountNumber;
		this.cardHolderName = cardHolderName;
		this.balance = balance;
		this.withdraw = withdraw;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {		
		this.balance += deposit;		
		this.deposit = deposit;
	}
	public double getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(double withdraw) {		
		this.withdraw = withdraw;
		this.balance -= withdraw + WITHDRAW_TAX;
	}
	
	public double getBalance() {
		return balance;
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