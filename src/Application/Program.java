package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Model.entitites.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner tc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/mm/yyyy");
		System.out.print("Room number: ");
		int number= tc.nextInt();
		System.out.println("check- in (date dd/mm/yyyy): ");
		Date  checkin= sdf.parse(tc.next());
		System.out.println("check- out (date dd/mm/yyyy): ");
		Date  checkout= sdf.parse(tc.next());

		if (!checkout.after(checkin)) {
			System.out.println("error in reservation: data de entrada posterior a data de saída");
		}
		else {
			Reservation reservation = new Reservation(null, checkin, checkout);
			System.out.println( " Reservation: " +reservation );
			
			System.out.println();
			System.out.println("Enter data to update the revervation: ");
			System.out.println("check- in (date dd/mm/yyyy): ");
			  checkin= sdf.parse(tc.next());
			System.out.println("check- out (date dd/mm/yyyy): ");
			 checkout= sdf.parse(tc.next());
			 
			 Date now= new Date();
			 if (checkin.before(now)||checkout.before(now) ) {
					System.out.println("error in reservation: as datas para atualizaçazões ");
			 }
			 else if (!checkout.after(checkin)) {
				 System.out.println("error in reservation: data de entrada posterior a data de saída");
			 }
			 
			 

			 reservation.updateDates(checkin, checkout);
			 System.out.println( " Reservation: " +reservation );
		     }
		
		
		tc.close();
		}
	}

	
	
		
		
		
		
		
		
		
		
		
		
	


