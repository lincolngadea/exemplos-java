package entities;

import java.text.Format;

public class Worker {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		
		return this.grossSalary - tax;
		
	}
	
	public void increaseSalary(double percentage) {
		
		this.grossSalary += (this.grossSalary * percentage)/100;
	}
	
	public String toString() {
		return name +", $ "+String.format("%.2f", this.netSalary());
	}
		
}
