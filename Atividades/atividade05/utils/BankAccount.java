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