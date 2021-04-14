package Test2Enum;
/**
 * Test 2 - OOP
 * @author Courtney Peacock
 * @date 16/03/2021
 * ExtraType enum (FRIDGE,MICROWAVE,COT)
 */
public enum ExtraType {

	FRIDGE(15), 
	MICROWAVE(5), 
	COT(5);
	
	private double value;
	
	private ExtraType(double e) {
		this.value = e;
		
	}
	
	public double getValue() {
		return value;
		
	}
	
	public void setValue(double value) {
		this.value = value;
		
	}
	
}
