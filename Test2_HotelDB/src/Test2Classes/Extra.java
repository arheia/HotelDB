package Test2Classes;
/**
 * Test 2 - OOP
 * @author Courtney Peacock
 * @date 16/03/2021
 * Extra class with get/set extra.
 */
import Test2Enum.ExtraType;

public class Extra {

	private double price;
	private ExtraType type;
	
	/**
	 * @return the price
	 */
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * @return the type
	 */
	public ExtraType getType() {
		return type;
	}
	
	/**
	 * @param type the type to set
	 */
	public void setType(ExtraType type) {
		this.type = type;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Addon: " + type + "\nAddon Price: " + price;
	}
	
}
