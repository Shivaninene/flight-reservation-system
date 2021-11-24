/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frs1;

import static frs1.Passenger.enterAddress;
import static frs1.Passenger.enterContact;
import static frs1.Passenger.login;
import static frs1.TouristTicket.locations;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class FRS1 {
    

    
    public static void main(String[] args) {
         String us,psd,n,ph,e,s,c,st;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("please enter username and Password");
        us=sc.nextLine();
        psd=sc.nextLine();
        Passenger.User p1=login(us,psd);
        
        Passenger p=new Passenger();
        
        System.out.println("enter contact details:");
        n=sc.nextLine();
        ph=sc.nextLine();
        e=sc.nextLine();
        Passenger.Contact p2=enterContact(n,ph,e);
        
        System.out.println("enter address details:");
        s=sc.nextLine();
        c=sc.nextLine();
        st=sc.nextLine();
        Passenger.Address p3=enterAddress(s,c,st);
       
        
        System.out.println("ID:"+p.getPassengerCount());
        p2.getContactDetails();
        p3.getAddressDetails();
        
        RegularTicket t1=new RegularTicket("mumbai","banglore","654329A213UI","24-11-2021, At 11:00","24-11-2021,At 12:00",3000,true);
        t1.updateTicketStatus(true);
        t1.getSpecialServiceDetails("indian","sprite","fries");
        t1.updateSpecialServiceDetails("burger", "lime soda", "chocolate");
        t1.updateTicketStatus(false);
        
        TouristTicket t2=new TouristTicket("delhi","banglore","698A213UI762","27-11-2021, At 09:00","27-11-2021,At 11:00",4000,true);
        t2.setHotelAddress("girnar hotel,banglore");
        t2.showHotelDetails();
        t2.selectTouristLocation();
        t2.showTouristLocation();
        t2.updateTicketStatus(true);
        t2.flight=new Flight("airline 320",9,"indigo",150,50);
        t2.flight.getFlightDetails();
        t2.flight.updateBookedSeats(2);
        printTicketDetails(t1);
        printTicketDetails(t2);
   }
    //It prints prn no of regular ticket
   public static void printTicketDetails(RegularTicket t)
   {
       System.out.println("Regular Ticket Prn:"+t.getPrn());
   }
   //It prints prn no of tourist ticket
   public static void printTicketDetails(TouristTicket t)
   {
       System.out.println("Tourist Ticket Prn:"+t.getPrn());
   }
}    