package entities;

public class OutsourcedEmployee extends Employee{
	private Double additionalCharge;

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCnarge() {
		return additionalCharge;
	}

	public void setAdditionalCnarge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	public Double payment() {
		double bonus =  additionalCharge * 110 /100;
		return valuePerHour * hours + bonus;
	}
	
}
