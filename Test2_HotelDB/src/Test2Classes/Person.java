package Test2Classes;
/**
 * Test 2 - OOP
 * @author Courtney Peacock
 * @date 16/03/2021
 * Person class implements comparable (sort by last name), contains all basic 
 * personal info.
 */
import Test2Enum.Province;

public abstract class Person implements Comparable<Object> { 

	private String id;
	private String firstName;
	private String lastName;
	private String address;
	private String postalCode;
	private String city;
	private Province province;
	private String phoneNumber;
	private String emailAddress;

	
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
	 */
	public Person(String id, String firstName, String lastName, String address, String postalCode, String city,
			Province province, String phoneNumber, String emailAddress) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.postalCode = postalCode;
		this.city = city;
		this.province = province;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}

	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the province
	 */
	public Province getProvince() {
		return province;
	}

	/**
	 * @param province the province to set
	 */
	public void setProvince(Province province) {
		this.province = province;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", postalCode=" + postalCode + ", city=" + city + ", province=" + province + ", phoneNumber="
				+ phoneNumber + ", emailAddress=" + emailAddress + "]";
	}	
	
	//compareTo
    public int compareTo(Object obj) {
        Person other = (Person)obj;
        return this.getLastName().compareTo(other.getLastName());
    }
}