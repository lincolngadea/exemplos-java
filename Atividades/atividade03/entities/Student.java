package entities;

public class Student {

	public String name;
	public double note1;
	public double note2;
	public double note3;
	
	public double calcFinalNote() {
		
		return note1+note2+note3;	
	}
	
	public void verifyApproval() {
		if (calcFinalNote() < 60) {		
			
			double missing = 60 - calcFinalNote();
			
			System.out.printf("FINAL GRADE %.2f%n",calcFinalNote());
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f%n",missing);
		}else {
			
			System.out.printf("FINAL GRADE %.2f%n",calcFinalNote());
			System.out.println("PASS");
		}
	}
	
}
