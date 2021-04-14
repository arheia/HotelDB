package Test2Classes;
/**
 * Test 2 - OOP
 * @author Courtney Peacock
 * @date 16/03/2021
 * Room class with basic room info.
 */
import Test2Enum.Bed;

public class Room {

    private String roomNumber;
    private String sqFootage;
    private boolean isSuite;
    private boolean hasTV;  
    private int numberOfBeds;
    private Bed typeOfBed;
    private boolean isClean;
    private boolean isRented;
    
    
	/**
	 * @param roomNumber
	 * @param sqFootage
	 * @param isSuite
	 * @param hasTV
	 * @param numberOfBeds
	 * @param typeOfBed
	 * @param isClean
	 * @param isRented
	 */
	public Room(String roomNumber, String sqFootage, boolean isSuite, boolean hasTV, int numberOfBeds, Bed typeOfBed,
			boolean isClean, boolean isRented) {
		super();
		this.roomNumber = roomNumber;
		this.sqFootage = sqFootage;
		this.isSuite = isSuite;
		this.hasTV = hasTV;
		this.numberOfBeds = numberOfBeds;
		this.typeOfBed = typeOfBed;
		this.isClean = isClean;
		this.isRented = isRented;
	}
	/**
	 * @return the roomNumber
	 */
	public String getRoomNumber() {
		return roomNumber;
	}
	/**
	 * @param roomNumber the roomNumber to set
	 */
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	/**
	 * @return the sqFootage
	 */
	public String getSqFootage() {
		return sqFootage;
	}
	/**
	 * @param sqFootage the sqFootage to set
	 */
	public void setSqFootage(String sqFootage) {
		this.sqFootage = sqFootage;
	}
	/**
	 * @return the isSuite
	 */
	public boolean isSuite() {
		return isSuite;
	}
	/**
	 * @param isSuite the isSuite to set
	 */
	public void setSuite(boolean isSuite) {
		this.isSuite = isSuite;
	}
	/**
	 * @return the hasTV
	 */
	public boolean isHasTV() {
		return hasTV;
	}
	/**
	 * @param hasTV the hasTV to set
	 */
	public void setHasTV(boolean hasTV) {
		this.hasTV = hasTV;
	}
	/**
	 * @return the numberOfBeds
	 */
	public int getNumberOfBeds() {
		return numberOfBeds;
	}
	/**
	 * @param numberOfBeds the numberOfBeds to set
	 */
	public void setNumberOfBeds(int numberOfBeds) {
		this.numberOfBeds = numberOfBeds;
	}
	/**
	 * @return the typeOfBed
	 */
	public Bed getTypeOfBed() {
		return typeOfBed;
	}
	/**
	 * @param typeOfBed the typeOfBed to set
	 */
	public void setTypeOfBed(Bed typeOfBed) {
		this.typeOfBed = typeOfBed;
	}
	/**
	 * @return the isClean
	 */
	public boolean isClean() {
		return isClean;
	}
	/**
	 * @param isClean the isClean to set
	 */
	public void cleanRoom() {
		if (isClean == false) { 
			
			isClean = true;
			System.out.println(roomNumber + "has now been cleaned.");
		}
		
		else isClean = false;
		System.out.println(roomNumber + "has been cleaned.");
	}
	
	/**
	 * @return the isRented
	 */
	public boolean isRented() {
		return isRented;
	}
	/**
	 * @param isRented the isRented to set
	 */
	public void setRented(boolean isRented) {
		this.isRented = isRented;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Room Number: " + roomNumber + "\nsqFootage: " + sqFootage + "\nSuite: " + isSuite + "\nTV: "
				+ hasTV + "\nNumber of Beds: " + numberOfBeds + "\n Bed Type: " + typeOfBed + "\nCleaned: " + isClean
				+ "\nRented: " + isRented;
	}
    
	
      
}
    
    
