package Test2Classes;
/**
 * Test 2 - OOP
 * @author Courtney Peacock
 * @date 16/03/2021
 * HotelTest class with 5 rooms, 5 employees, 5 people, 5 payments. - Extras is broken.
 */
import java.time.LocalDate;
import Test2Enum.Bed;
import Test2Enum.Discount;
import Test2Enum.ExtraType;
import Test2Enum.PaymentType;
import Test2Enum.Province;

public class HotelTest {
	
	public static void main(String[] args) {

		HotelDB hotel = new HotelDB();
/* 
 * Room(String roomNumber, String sqFootage, boolean isSuite, boolean hasTV, int numberOfBeds, 
 * Bed typeOfBed, boolean isClean, boolean isRented)
 */

Room room1 = new Room("r1", "330", true, true, 1, Bed.QUEEN, true, true);
Room room2 = new Room("r2", "630", true, true, 1, Bed.KING, false, true);
Room room3 = new Room("r3", "830", true, true, 2, Bed.DOUBLE, true, true);
Room room4 = new Room("r4", "330", true, true, 1, Bed.QUEEN, true, true);
Room room5 = new Room("r5", "1030", true, true, 1, Bed.KING, true, true);

hotel.addRoom(room1);
hotel.addRoom(room2);
hotel.addRoom(room3);
hotel.addRoom(room4);
hotel.addRoom(room5);

/*	
 * Guest(String id, String firstName, String lastName, String postalCode, String city, 
 * Province province, String phoneNumber, String emailAddress, String ccNum) 
 */

Guest guest1 = new Guest("g1", "Harry", "Potter", "E1C 0G5", "Moncton", 
		Province.NB, "506-353-7884", "harry@potter.hogwarts", "1234 5678 9511 5411");
Guest guest2 = new Guest("g2", "Ron", "Weasley", "F3H 7V3", "Toronto", 
		Province.ON, "613-362-6526", "Ron@Weasley.hogwarts", "2635 4248 4146 7321");
Guest guest3 = new Guest("g3", "Hermione", "Granger", "F5H 3G6", "Halifax", 
		Province.NS, "902-673-7263", "Hermione@Granger.hogwarts", "6164 2678 9621 1462");
Guest guest4 = new Guest("g4", "Luna", "Lovegood", "L3J 0R5", "Charlottetown", 
		Province.PE, "782-952-5163", "Luna@Lovegood.hogwarts", "6727 5673 7567 4341");
Guest guest5 = new Guest("g5", "Neville", "Longbottom", "E6B 8H8", "Dildo", 
		Province.NL, "709-651-6425", "Neville@Longbottom.hogwarts", "6537 8437 7327 9168");

hotel.addGuest(guest1);
hotel.addGuest(guest2);
hotel.addGuest(guest3);
hotel.addGuest(guest4);
hotel.addGuest(guest5);

hotel.sortGuest();
hotel.printGuest();

/*
 * Employee(String id, String firstName, String lastName, String address, String postalCode, String city,
 * Province province, String phoneNumber, String emailAddress, String sin, LocalDate dob)
 */

Employee employee1 = new Employee("e1", "Albus", "Dumbledore", "1 Dumbledore Drive", "H3R 7C4", "Surrey", 
		Province.BC, "778-123-4567", "Albus@Dumbledore.hogwarts", "812 625 245", LocalDate.of(1881, 7, 17)); 
Employee employee2 = new Employee("e2", "Minerva", "McGonagall", "1 Dumbledore Drive", "J8Y 2Y4", "Hamilton", 
		Province.ON, "778-123-4567", "Minerva@McGonagall.hogwarts", "287 435 725", LocalDate.of(1902, 4, 11)); 
Employee employee3 = new Employee("e3", "Rubeous", "Hagrid", "1 Aragog Drive", "R6G 6K3", "Vancouver", 
		Province.NS, "778-123-4567", "Rubeous@Hagrid.hogwarts", "122 435 664", LocalDate.of(1881, 12, 6)); 
Employee employee4 = new Employee("e4", "Pomona ", "Sprout", "7 Sprout Lane", "G4B 4H8", "Tignish", 
		Province.PE, "778-123-4567", "Pomona@Sprout.hogwarts", "512 524 514", LocalDate.of(1890, 5, 15)); 
Employee employee5 = new Employee("e5", "Sybill", "Trelawney", "42 Sybill Street", "R3H 3G5", "Gander", 
		Province.NL, "778-123-4567", "Sybill@Trelawney.hogwarts", "823 532 737", LocalDate.of(1906, 3, 9)); 

hotel.addEmployee(employee1);
hotel.addEmployee(employee2);
hotel.addEmployee(employee3);
hotel.addEmployee(employee4);
hotel.addEmployee(employee5);

hotel.sortEmployee();
hotel.printEmployee();

/*
 * Booking Booking(String id, Guest guest, Room room, Employee employee, 
 * LocalDate checkInDate, LocalDate checkOutDate, double roomRate, Discount discount) 
 * addExtra(int i, ExtraType type)
 * public Booking(String id, Guest guest, Room room, Employee employee, LocalDate checkInDate,
 * LocalDate checkOutDate, double roomRate, ExtraType extra, Discount discount)
 * 
 */

Booking booking1 = new Booking("b1", guest1, room1, employee1, LocalDate.of(2021, 3, 14), LocalDate.of(2021, 3, 17), 100, Discount.SPECIAL);
Booking booking2 = new Booking("b2", guest2, room2, employee2, LocalDate.of(2021, 3, 16), LocalDate.of(2021, 3, 18), 200, Discount.GOV);
Booking booking3 = new Booking("b3", guest3, room3, employee3, LocalDate.of(2021, 3, 14), LocalDate.of(2021, 3, 17), 75, null);
Booking booking4 = new Booking("b4", guest4, room4, employee4, LocalDate.of(2021, 3, 14), LocalDate.of(2021, 3, 19), 100, Discount.CAA);
Booking booking5 = new Booking("b5", guest5, room5, employee5, LocalDate.of(2021, 3, 14), LocalDate.of(2021, 3, 20), 200, null);

// These don't take affect though, even after 8hours of fiddling around.
booking1.addExtra(15, ExtraType.FRIDGE);
booking1.addExtra(15, ExtraType.MICROWAVE);
booking3.addExtra(5, ExtraType.COT);
booking3.addExtra(5, ExtraType.FRIDGE);
booking5.addExtra(5, ExtraType.MICROWAVE);
booking5.addExtra(15, ExtraType.FRIDGE);
booking5.addExtra(5, ExtraType.COT);


/*
 * Payment(String id, PaymentType paymentType, Booking booking) 
 */
Payment payment1 = new Payment("ORD1 | BOOKING1", PaymentType.CC, booking1);
Payment payment2 = new Payment("ORD2 | BOOKING2", PaymentType.CASH, booking2);
Payment payment3 = new Payment("ORD3 | BOOKING3", PaymentType.CC, booking3);
Payment payment4 = new Payment("ORD4 | BOOKING4", PaymentType.DEBIT, booking4);
Payment payment5 = new Payment("ORD5 | BOOKING5", PaymentType.CC, booking5);



/*
 * Outputs
 */

//Rooms
System.out.println("\n[Rooms]\n");
System.out.println(room1.toString() + "\n");
System.out.println(room2.toString() + "\n");
System.out.println(room3.toString() + "\n");
System.out.println(room4.toString() + "\n");
System.out.println(room5.toString() + "\n");


//Guests
//System.out.println("\n[Guests]\n");
//System.out.println(guest1.toString() + "\n");
//System.out.println(guest2.toString() + "\n");
//System.out.println(guest3.toString() + "\n");
//System.out.println(guest4.toString() + "\n");
//System.out.println(guest5.toString() + "\n");


//Employees
//System.out.println("\n[Employees]\n");
//System.out.println(employee1.toString() + "\n");
//System.out.println(employee2.toString() + "\n");
//System.out.println(employee3.toString() + "\n");
//System.out.println(employee4.toString() + "\n");
//System.out.println(employee5.toString() + "\n");

//Payments
System.out.println("\n[Payments]\n");
System.out.println(payment1.toString() + "\n");
System.out.println(payment2.toString() + "\n");
System.out.println(payment3.toString() + "\n"); 
System.out.println(payment4.toString() + "\n");
System.out.println(payment5.toString() + "\n");

	}
}