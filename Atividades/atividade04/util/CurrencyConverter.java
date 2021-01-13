package util;

public class CurrencyConverter {
	public static final double IOF = 6;
	
//	public double atualPrice;
	
	public static double price(double value, double atualPrice) {
	
		value += value * IOF/100;
		return value * atualPrice;
	}
	
}
