package Test2Classes;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import Test2Enum.Bed;
import Test2Enum.Province;

class HotelJunitTest {
	
	@Test
    public void isSuiteTrueTest() {
           Room r1 = new Room("r1", "330", true, true, 1, Bed.QUEEN, true, true);
           assertEquals(true, r1.isSuite());
    }
	
	@Test
    public void isSuiteFalseTest() {
           Room r2 = new Room("r2", "660", false, true, 1, Bed.KING, true, true);
           assertEquals(false, r2.isSuite());
    }
		
	@Test
    public void isHasTVFalseTest() {
           Room r3 = new Room("r3", "660", true, false, 1, Bed.KING, true, true);
           assertEquals(false, r3.isHasTV());          
    }
	 
	@Test
    public void isHasTVTrueTest() {
           Room r4 = new Room("r4", "426", true, true, 1, Bed.KING, true, true);
           assertEquals(true, r4.isHasTV());          
    }
	
	
	@Test
	public void getSqFootageTest() {
        Room r6 = new Room("r6", "1060", true, true, 1, Bed.QUEEN, true, true);
        assertEquals("1060", r6.getSqFootage()); 
	
	}
	
	
	@Test
	public void getEmployeeNameTest() {
	Employee e1 = new Employee("e1", "Albus", "Dumbledore", "1 Dumbledore Drive", "V9P 2Y4", "Vancouver", 
			Province.BC, "778-123-4567", "Albus@Dumbledore.hogwarts", "122 435 664", LocalDate.of(1881, 7, 17)); 
			assertEquals("Albus", e1.getFirstName()); 
	}
	
	@Test
	public void getGuestEmailTest() {
	Guest g4 = new Guest("g4", "Luna", "Lovegood", "L3J 0R5", "Charlottetown", 
				Province.PE, "782-952-5163", "Luna@Lovegood.hogwarts", "6727 5673 7567 4341"); 
			assertEquals("Luna@Lovegood.hogwarts", g4.getEmailAddress()); 
	}
	
	@Test
	public void getSinTest() {
		Employee employee1 = new Employee("e1", "Albus", "Dumbledore", "1 Dumbledore Drive", "V9P 2Y4", "Surrey", 
		Province.BC, "778-123-4567", "Albus@Dumbledore.hogwarts", "122 435 664", LocalDate.of(1881, 7, 17)); 
		assertEquals("122 435 664", employee1.getSin());
		 
	}
	
	@Test
	public void addEmployeeTest() {
		   HotelDB hotel = new HotelDB();
		   Employee employee5 = new Employee("e5", "Sybill", "Trelawney", "42 Sybill Street", "V9P 2Y4", "Gander", 
					Province.NL, "778-123-4567", "Sybill@Trelawney.hogwarts", "122 435 664", LocalDate.of(1881, 7, 17));
		   assertEquals (true, hotel.addEmployee(employee5));
	}
	
	
	@Test
	public void removeEmployeeTest() {
		   HotelDB hotel = new HotelDB();
		   Employee employee5 = new Employee("e5", "Sybill", "Trelawney", "42 Sybill Street", "V9P 2Y4", "Gander", 
					Province.NL, "778-123-4567", "Sybill@Trelawney.hogwarts", "122 435 664", LocalDate.of(1881, 7, 17));
		   hotel.addEmployee(employee5);
		   assertEquals (true, hotel.removeEmployee("122 435 664"));
	}
	
	
	@Test
	public void addGuestTest() {
		   HotelDB hotel = new HotelDB();
		   Guest guest1 = new Guest("g1", "Harry", "Potter", "E1C 0G5", "Moncton", 
					Province.NB, "506-353-7884", "harry@potter.hogwarts", "1234 5678 9511 5411");
		   assertEquals (true, hotel.addGuest(guest1));
	}
	
	
	@Test
	public void removeGuestTest() {
		   HotelDB hotel = new HotelDB();
		   Guest guest1 = new Guest("g1", "Harry", "Potter", "E1C 0G5", "Moncton", 
				   Province.NB, "506-353-7884", "harry@potter.hogwarts", "1234 5678 9511 5411");
		   hotel.addGuest(guest1);
		   assertEquals (true, hotel.removeGuest("1234 5678 9511 5411"));
	}
	
	
	@Test
	public void addRoomTest() {
		   HotelDB hotel = new HotelDB();
		   Room room3 = new Room("r3", "830", true, true, 2, Bed.DOUBLE, true, true);
		   assertEquals (true, hotel.addRoom(room3));
	}
	
	
	@Test
	public void removeRoomTest() {
		   HotelDB hotel = new HotelDB();
		   Room room3 = new Room("r3", "830", true, true, 2, Bed.DOUBLE, true, true);
		   hotel.addRoom(room3);
		   assertEquals (true, hotel.removeRoom("r3"));
	}

}








