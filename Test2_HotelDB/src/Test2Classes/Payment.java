package Test2Classes;
/**
 * Test 2 - OOP
 * @author Courtney Peacock
 * @date 16/03/2021
 * Payment class for id, type, date with calculations for total, tax, discount, subtotal, and paid.
 */
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import Test2Enum.Discount;
import Test2Enum.PaymentType;

public class Payment {
    
	private String id;
	private PaymentType paymentType;
	private Booking booking;
	private LocalDate paymentDate;
	    
	/**
	 * @param id
	 * @param paymentType
	 * @param booking
	 * @param paymentDate
	 */
	public Payment(String id, PaymentType paymentType, Booking booking) {
		
		this.id = id;
		this.paymentType = paymentType;
		this.booking = booking;
		this.paymentDate = booking.getCheckInDate();
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
	 * @return the paymentType
	 */
	public PaymentType getPaymentType() {
		return paymentType;
	}
	
	/**
	 * @param paymentType the paymentType to set
	 */
	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}
	
	/**
	 * @return the paymentDate
	 */
	public LocalDate getPaymentDate() {
		return paymentDate;
	}
	
	/**
	 * @param paymentDate the paymentDate to set
	 */
	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}
	    
	/**
	 * Calculates subtotal based on days stayed, counts from checkin date to checkout date.
	 * @return
	 */
	public double calcSubtotal() {
		long daysStaying = ChronoUnit.DAYS.between(booking.getCheckInDate(), booking.getCheckOutDate());
		return booking.getRoomRate()*daysStaying;
    }
	
	/**
	 * Calculates a tax of 15%
	 * @return
	 */
	public double calcTax() {
		if(booking.getExtraTotal() == 0) {
			return (calcSubtotal() - calcDiscount())*0.15;
		}
		return (calcSubtotal() + booking.getExtraTotal() - calcDiscount())*0.15;
	}
	
	/**
	 * Uses the 3 discount types from Discount enum.
	 * @return
	 */
	public double calcDiscount() {
		Discount discount = booking.getDiscount();
		double value = 0;
		if(discount == null) {
			return 0;
		}
		switch(discount) {
			case CAA:
				value = Discount.CAA.getValue();
				break;
			case GOV:
				value = Discount.GOV.getValue();
				break;
			case SPECIAL:
				value = Discount.SPECIAL.getValue();
				break;
		}
		
		return calcSubtotal()*value;
	}
	
	/**
	 * Calculates total including discounts and tax.
	 * @return
	 */
	//This appears to completely disregard that there are any extras linked to bookings, so that's awesome.  8 hours on extras for no result. 
	public double calcTotal() {
		if (booking.getExtraTotal() == 0) {
			return (calcSubtotal() - calcDiscount()) + calcTax();
		}
		return (calcSubtotal() + booking.getExtraTotal() - calcDiscount()) + calcTax();
	}
	
	public double amountPaid() {
		double paid = 0;
		switch(paymentType) 
		{
		case CC:
			paid = calcTotal();
			break;
		case CASH:
			paid = calcTotal();
			break;
		case DEBIT:
			paid = calcTotal();
			break;
		}
		System.out.println("Total: $" + calcTotal() + " was paid on " + paymentDate);
		return paid;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		return "Order ID: " + id + "\nPayment Type: " + paymentType + "\nPayment Date: " + paymentDate + "\nSubtotal: " + calcSubtotal() + "\nAddons: "+ booking.getExtraTotal() + "\nTax: " + calcTax() + "\nDiscount: "
				+ calcDiscount() + "\nTotal: " + calcTotal() + "\nPaid: " + amountPaid();
	}

}