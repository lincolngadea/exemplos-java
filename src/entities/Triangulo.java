package entities;

public class Triangulo {
	
	public double A;
	public double B;
	public double C;
	
	public double area() {
		
		double local = (A+B+C)/2.00;
		return Math.sqrt(local *(local-A)*(local-B)*(local-C));
		
	}
}
