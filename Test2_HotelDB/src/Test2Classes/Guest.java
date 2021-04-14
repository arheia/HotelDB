package Test2Classes;
/**
 * Test 2 - OOP
 * @author Courtney Peacock
 * @date 16/03/2021
 * Guest class with basic guest info (extended from Person).
 */
import Test2Enum.Province;

public class Guest extends Person {

	private String ccNumber;
	private String notes;
	private boolean isCheckedIn;


	public Guest(String id, String firstName, String lastName, String postalCode, String city, 
			Province province, String phoneNumber, String emailAddress) {
		
		super(id, firstName, lastName, postalCode, city, emailAddress, 
				province, phoneNumber, emailAddress);
		this.isCheckedIn = false; 
	}
	
	public Guest(String id, String firstName, String lastName, String postalCode, String city, 
			Province province, String phoneNumber, String emailAddress, String ccNum) {
		
		super(id, firstName, lastName, postalCode, city, emailAddress, 
				province, phoneNumber, emailAddress);
		this.ccNumber = ccNum;
		this.isCheckedIn = false; 
	}

	/**
	 * @return the ccNumber
	 */
	public String getCcNumber() {
		return ccNumber;
	}

	/**
	 * @param ccNumber the ccNumber to set
	 */
	public void setCcNumber(String ccNumber) {
		this.ccNumber = ccNumber;
	}

	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}

	/**
	 * @return the isCheckedIn
	 */
	public boolean isCheckedIn() {
		return isCheckedIn;
	}

	/**
	 * @param isCheckedIn the isCheckedIn to set
	 */
	public void setCheckedIn(boolean isCheckedIn) {
		if (isCheckedIn == false)  
			isCheckedIn = true;
				else isCheckedIn = true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\nName: " + getLastName() + ", " + getFirstName() + "\nCC Number: " + ccNumber + "\nNotes: " + notes + "\nChecked In: " + isCheckedIn;
	}
	
}
