package Test2Enum;
/**
 * Test 2 - OOP
 * @author Courtney Peacock
 * @date 16/03/2021
 * Discount enum (CAA,GOV,SPECIAL)
 */
public enum Discount {

	CAA(0.10), 
	GOV(0.15), 
	SPECIAL(0.20);
	
	private double value;
	
	private Discount(double d) {
		this.value = d;
		
	}
	
	public double getValue() {
		return value;
		
	}
	
	public void setValue(double value) {
		this.value = value;
		
	}
	
}
