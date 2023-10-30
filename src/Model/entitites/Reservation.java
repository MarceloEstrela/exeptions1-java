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
	
	public Srting updateDates (Date checkin, Date checkout ) {
		 
		 Date now= new Date();
		 if (checkin.before(now)||checkout.before(now) ) {
				return "error in reservation: as datas para atualizacão devem ser futuras";
		 }
		  if (!checkout.after(checkin)) {
			 return"error in reservation: data de entrada posterior a data de saída";
		 }
	     this.checkin=checkin;
	     this.checkout= checkout;
	     return null;
	  
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