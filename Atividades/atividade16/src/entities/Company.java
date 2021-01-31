package entities;

public class Company extends TaxPayer {

	private Integer employee;

	public Company(String name, Double anualIncome, Integer employee) {
		super(name, anualIncome);
		this.employee = employee;
	}

	public Integer getEmployee() {
		return employee;
	}

	public void setEmployee(Integer employee) {
		this.employee = employee;
	}

	public double calcTax() {

		Double tax = super.getAnualIncome() * 16 / 100;

		if (employee > 10) {

			tax = super.getAnualIncome() * 14 / 100;
		}

		return tax;
	}
}
