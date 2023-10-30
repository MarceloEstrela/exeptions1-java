package Model.entitites;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	private Integer rooNumber;
	private Date checkin;
	private Date checkout;
	
	private static SimpleDateFormat sdf =  new SimpleDateFormat ("dd/MM/yyyy") ;
	
	public Reservation(Integer rooNumber, Date checkin, Date checkout) {
		this.rooNumber = rooNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}
	public Integer getRooNumber() {
		return rooNumber;
	}
	public void setRooNumber(Integer rooNumber) {
		this.rooNumber = rooNumber;
	}
	public Date getCheckin() {
		return checkin;
	}
	
	public Date getCheckout() {
		return checkout;
	}
	 
	public long duration () {
		long diff = checkout.getTime()-checkin.getTime();
		 return TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);
	}
	
	public void updateDates (Date checkin, Date checkout ) {
	this.checkin=checkin;
	this.checkout= checkout;
	
}
	@Override
	public String toString() {
		return "Room"
				+ rooNumber
				+", check-in: " 
				+ sdf.format(checkin)
				+ ", check-out: "
				+ ", "
				+ duration()
				+ "nights";
		
		
	}
	
	
	
	
}