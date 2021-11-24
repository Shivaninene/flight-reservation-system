/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frs1;
import java.util.Scanner;

abstract public class Ticket {
      private String departure;
      private String destination;
      private String prn;
      private String dtOfDeparture;
      private String dtOfArrival;
      private long price;
      public  Flight flight;
      private Passenger passenger;
      private boolean status;
      public Ticket(String d,String de,String prn,String dtod,String dtoa,long price,boolean Status)
      {
       this.setDeparture(d);
       this.setDestination(de);
       this.setPrn(prn);
       this.setDtOfDeparture(dtod);
       this.setDtOfArrival(dtoa);
       this.setPrice(price);
      }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setPrn(String prn) {
        this.prn = prn;
    }

    public void setDtOfDeparture(String dtOfDeparture) {
        this.dtOfDeparture = dtOfDeparture;
    }

    public void setDtOfArrival(String dtOfArrival) {
        this.dtOfArrival = dtOfArrival;
    }
     public void setPrice(long p)
       {
          this.price=p; 
       }
       public long getPrice()
       {
           return price;
       }
       public Flight getFlight()
       {
           return flight;
       }
      public void setFlight(Flight flight)
      {
          this.flight=flight;
      }
      //It returns status of ticket
      public boolean isTicketStatus()
      {
          return true;
      }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public String getPrn() {
        return prn;
    }

    public String getDtOfDeparture() {
        return dtOfDeparture;
    }

    public String getDtOfArrival() {
        return dtOfArrival;
    }
    public void updateTicketStatus(boolean status)
    {
        if(status==true)
        {
            System.out.println("Ticket booked ");
        }
        else
        {System.out.println("Ticket Cancelled");}
    }
      
}
class RegularTicket extends Ticket
{
    private String food;
    private String water;
    private String snacks;
    public RegularTicket(String d, String de, String prn, String dtod, String dtoa, long p, boolean s) {
        super(d, de, prn, dtod, dtoa,p,s);
        System.out.println("\nRegular Ticket\nprn"+super.getPrn()+"\nDeparture"+super.getDeparture()+"\nDestination:"+super.getDestination()+"\nDtofDeparture:"+super.getDtOfDeparture()+"\nDtofarrival:"+super.getDtOfArrival()+"\nPrice:"+super.getPrice()+"\nStatus:"+super.isTicketStatus());
    }
    //It gives Special sevices provided to the passenger
    public void getSpecialServiceDetails(String f,String w,String s)
    {
        this.food=f;
        this.water=w;
        this.snacks=s;
        System.out.println( this.food+"\n"+this.water+"\n"+this.snacks);
    }
    public void updateSpecialServiceDetails(String f,String w,String sn)
    {
        this.food=f;
        this.water=w;
        this.snacks=sn;
        
        System.out.println("services availed are:"+this.food+", "+this.water+", "+this.snacks);
    }
   
 }
class TouristTicket extends Ticket
{
    String hotelAddress;
    static String[] locations=new String[5];
    public TouristTicket(String d, String de, String prn, String dtod, String dtoa, long p, boolean s) {
        super(d, de, prn, dtod, dtoa,p,s);
        System.out.println("\nTourist Ticket\nprn"+super.getPrn()+"\nDeparture"+super.getDeparture()+"\nDestination:"+super.getDestination()+"\nDtofDeparture:"+super.getDtOfDeparture()+"\nDtofarrival:"+super.getDtOfArrival()+"\nPrice:"+super.getPrice()+"\nStatus:"+super.isTicketStatus());
    }
    //getter and setter method for the attribute hotelAddress.
    public String  getHotelAddress()
    {
        return hotelAddress;
    }

    public void setHotelAddress(String  hotelAddress)
    {
        this.hotelAddress = hotelAddress;
    }
    
    Scanner sc=new Scanner(System.in);
    public void selectTouristLocation() {
        System.out.println("Enter locations :");
        for (int i = 0; i <= 4; i++) {
            locations[i]=sc.next();
        }
    }
    //It shows details of hotel
    public void showHotelDetails()
    {
        System.out.println("hotel address:"+getHotelAddress());
    }
    //It shows details of touristLocation.
    public void showTouristLocation()

    {
        for(int i=0;i<=4;i++)
        {
            System.out.println("locations selected are:" + locations[i]);
        }

    }
    
}

