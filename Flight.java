/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frs1;

/**
 *
 * @author Admin
 */
public class Flight {
     private String flightName;
    private int flightNumber;
    private String airline;
    private int capacity;
    private int bookedSeats;

    public Flight(String flightName, int flightNumber, String airline, int capacity, int bookedSeats) {
        this.flightName = flightName;
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }
    //It shows flight details
    public void  getFlightDetails()
    {
       System.out.println("\nFlight name : "+flightName+"\nflight number : "+flightNumber+"\nairline : "+airline+"\ncapacity : "+capacity+"\nbooked seats : "+bookedSeats); 
    }
    //It updates count of the seats which are booked
    public int updateBookedSeats(int recent)
    {
        int u=bookedSeats +recent;
        System.out.println("update seats booked:"+u);
        return u;
    }
    
}
