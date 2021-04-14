package Test2Classes;
/**
 * Test 2 - OOP
 * @author Courtney Peacock
 * @date 16/03/2021
 * Booking class with basic booking info with dates, rates, and discount, price, 
 * employee, and guest associations.
 */
import java.time.LocalDate;
import java.util.ArrayList;
import Test2Enum.Discount;
import Test2Enum.ExtraType;

public class Booking {
	ArrayList<Extra> extraList = new ArrayList<Extra>();
	
	    private String id; 
	    private Guest guest; 
	    private Room room; 
	    private Employee employee;
	    private LocalDate checkInDate;
	    private LocalDate checkOutDate;
	    private double roomRate;
	    private Discount discount;
	    
	        
		/**
		 * @param id
		 * @param guest
		 * @param room
		 * @param employee
		 * @param checkInDate
		 * @param checkOutDate
		 * @param roomRate
		 * @param discount
		 */
	    public Booking(String id, Guest guest, Room room, Employee employee, LocalDate checkInDate,
				LocalDate checkOutDate, double roomRate, Discount discount) {
			super();
			this.id = id;
			this.guest = guest;
			this.room = room;
			this.employee = employee;
			this.checkInDate = checkInDate;
			this.checkOutDate = checkOutDate;
			this.roomRate = roomRate;
			this.discount = discount;
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
		 * @return the guest
		 */
		public Guest getGuest() {
			return guest;
		}
		
		/**
		 * @param guest the guest to set
		 */
		public void setGuest(Guest guest) {
			this.guest = guest;
		}
		
		/**
		 * @return the room
		 */
		public Room getRoom() {
			return room;
		}
		
		/**
		 * @param room the room to set
		 */
		public void setRoom(Room room) {
			this.room = room;
		}
		
		/**
		 * @return the employee
		 */
		public Employee getEmployee() {
			return employee;
		}
		
		/**
		 * @param employee the employee to set
		 */
		public void setEmployee(Employee employee) {
			this.employee = employee;
		}
		
		/**
		 * @return the checkInDate
		 */
		public LocalDate getCheckInDate() {
			return checkInDate;
		}
		
		/**
		 * @param checkInDate the checkInDate to set
		 */
		public void setCheckInDate(LocalDate checkInDate) {
			this.checkInDate = checkInDate;
		}
		
		/**
		 * @return the checkOutDate
		 */
		public LocalDate getCheckOutDate() {
			return checkOutDate;
		}
		
		/**
		 * @param checkOutDate the checkOutDate to set
		 */
		public void setCheckOutDate(LocalDate checkOutDate) {
			this.checkOutDate = checkOutDate;
		}
		
		/**
		 * @return the roomRate
		 */
		public double getRoomRate() {
			return roomRate;
		}
		
		/**
		 * @param roomRate the roomRate to set
		 */
		public void setRoomRate(double roomRate) {
			this.roomRate = roomRate;
		}
		
		/**
		 * @return the discount
		 */
		public Discount getDiscount() {
			return discount;
		}
		
		/**
		 * @param discount the discount to set
		 */
		public void setDiscount(Discount discount) {
			this.discount = discount;
		}

		/**
		 * @return the extraList
		 */
		public String getExtra() {
			if(extraList == null) {
				return "No extra will be added to this room.";
			}
			
			for(int i = 0; i < extraList.size(); i++) {
				System.out.println(extraList.get(i).getType() + " $" + extraList.get(i).getPrice() + "\n");
			}
			
			return " ";
			
		}
		public double getExtraTotal() {
			if(extraList == null) {
				return 0; 
			}
			double price = 0;
			for (int i = 0; i < extraList.size(); i++) {
				price += extraList.get(i).getPrice();
			}
			
			return price;
		}

		public void addExtra(int i, ExtraType type) {
			// TODO Auto-generated method stub
			
		}
}