package Test2Classes;
/**
 * Test 2 - OOP
 * @author Courtney Peacock
 * @date 16/03/2021
 * HotelDB class with room, employee, and guest array list creation and removal. 
 */
import java.util.ArrayList;
import java.util.Collections;


public class HotelDB {

	private ArrayList<Room> roomList = new ArrayList<Room>();
	private ArrayList<Employee> employeeList = new ArrayList<Employee>();
	private ArrayList<Guest> guestList = new ArrayList<Guest>();
	
	
	public void sortGuest () {
        Collections.sort(guestList);
    }

    public void sortEmployee () {
        Collections.sort(employeeList);
    }

	
 
    public void printGuest() {
        System.out.println ("[Guest List]");
        for (Guest guest: guestList)
            System.out.println (guest);
    }
    
    public void printEmployee() {
        System.out.println ("\n[Employee List]");
        for (Employee employee: employeeList)
            System.out.println (employee);
    }
    
    /**
	 * Add room
	 * @param room
	 * @return
	 */
	public boolean addRoom(Room room) {
		roomList.add(room);
		return true;
	}
	
	/**
	 * Add employee
	 * @param employee
	 * @return
	 */
	public boolean addEmployee(Employee employee) {
		employeeList.add(employee);
		return true;
	 }
	
	/**
	 * Add guest
	 * @param guest
	 * @return
	 */
	
	public boolean addGuest(Guest guest) {
		guestList.add(guest);
		return true;
	}
		
	/**
	 * Remove room
	 * @param roomNumber
	 * @return
	 */
	public boolean removeRoom(String roomNumber) {
		if(roomList == null) {
			return false;
		}
		
		for(int i = 0; i < roomList.size(); i++) {
			if(roomList.get(i).getRoomNumber().equals(roomNumber)) {
				roomList.remove(i);
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Remove employee
	 * @param sin
	 * @return
	 */
	public boolean removeEmployee(String sin) {
		if(employeeList == null) {
			return false;
		}
		
		for(int i = 0; i < employeeList.size(); i++) {
			if(employeeList.get(i).getSin().equals(sin)) {
				employeeList.remove(i);
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Remove guest
	 * @param ccNumber
	 * @return
	 */
	public boolean removeGuest(String ccNumber) {
		if(guestList == null) {
			return false;
		}
		
		for(int i = 0; i < guestList.size(); i++) {
			if(guestList.get(i).getCcNumber().equals(ccNumber)) {
				guestList.remove(i);
				return true;
			}
		}
		return false;
	}
	
}
	
