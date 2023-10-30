package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Model.Exceptions.DomainException;
import Model.entitites.Reservation;

public class Program {

	public static void main(String[] args) {
		try {
			Scanner tc = new Scanner (System.in);
			SimpleDateFormat sdf = new SimpleDateFormat ("dd/mm/yyyy");
			System.out.print("Room number: ");
			int number= tc.nextInt();
			System.out.println("check- in (date dd/mm/yyyy): ");
			Date  checkin= sdf.parse(tc.next());
			System.out.println("check- out (date dd/mm/yyyy): ");
			Date  checkout= sdf.parse(tc.next());
	
			Reservation reservation = new Reservation(null, checkin, checkout);
			System.out.println( " Reservation: " +reservation );
			
			System.out.println();
			System.out.println("Enter data to update the revervation: ");
			System.out.println("check- in (date dd/mm/yyyy): ");
			checkin= sdf.parse(tc.next());
			System.out.println("check- out (date dd/mm/yyyy): ");
			checkout= sdf.parse(tc.next());
			
	        reservation.updateDates(checkin, checkout);
			System.out.println( " Reservation: " +reservation );
		 }
		    catch (ParseException e) {
		    	System.out.println("invlalid date format");
		    }
			
		catch (DomainException e) {
			System.out.println("error reservation: " + e.getMessage());
		}
		catch (RuntimeException e) {
		 System.out.println("unexpected error");
		}
		
	}
}

	

	
	
		
		
		
		
		
		
		
		
		
		
	


