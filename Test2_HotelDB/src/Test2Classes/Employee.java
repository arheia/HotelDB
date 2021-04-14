package Test2Classes;
/**
 * Test 2 - OOP
 * @author Courtney Peacock
 * @date 16/03/2021
 * Employee class with basic employee info (extended from Person).
 */
import java.time.LocalDate;
import Test2Enum.Province;

public class Employee extends Person {
	
	private String sin;
    private LocalDate dob;

        //I hope these are not overkill, trying to include as much as possible
    public Employee(String id, String firstName, String lastName, String address, String postalCode, String city, Province province, String phoneNumber, String emailAddress) {
		
    	super(id, firstName, lastName, address, postalCode, city, province, phoneNumber, emailAddress);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param postalCode
	 * @param city
	 * @param province
	 * @param phoneNumber
	 * @param emailAddress
	 * @param sin
	 * @param dob
	 */
	public Employee(String id, String firstName, String lastName, String address, String postalCode, String city,
			Province province, String phoneNumber, String emailAddress, String sin, LocalDate dob) {
		
		super(id, firstName, lastName, address, postalCode, city, province, phoneNumber, emailAddress);
		this.sin = sin;
		this.dob = dob;
	}

	/**
	 * @return the sin
	 */
	public String getSin() {
		return sin;
	}

	/**
	 * @param sin the sin to set
	 */
	public void setSin(String sin) {
		this.sin = sin;
	}

	/**
	 * @return the dob
	 */
	public LocalDate getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\nName: " + getLastName() + ", " + getFirstName() + "\nSin: " + sin + "\nDOB: " + dob;
	}

}