package entities;

public class Individual extends TaxPayer {

	private Double healtSpending = 0.0;

	public Individual(String name, Double anualIncome, Double healtSpending) {
		super(name, anualIncome);
		this.healtSpending = healtSpending;
	}

	public Double getCheersAmount() {
		return healtSpending;
	}

	public void setCheersAmount(Double healtSpending) {
		this.healtSpending = healtSpending;
	}

	@Override
	public double calcTax() {

		Double rent = super.getAnualIncome();
		Double tax;

		if (rent < 20000.00) {
			tax = rent * 15 / 100;
		} else {
			tax = rent * 25/100;
		}
		
		if(healtSpending > 0) {
			tax -= healtSpending/2;
		}
		
		return tax;
	}

}
