/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frs1;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
//Passenger class
public class Passenger {
    private int id;
    private static int idCounter;
    private static Address address;
    private static Contact contact;
    private static User user;
    static{
        idCounter=0;
    }
    public Passenger()
    {
        this.id=idCounter;
        idCounter++;
    }
    //Constuctor for Contact class
    public Passenger(int i,String name,String ph,String e)
    {
        this.contact=new Contact(name,ph,e);
        this.id=i;
        contact.getContactDetails();
    }
    //Constructor for Address class 
    public Passenger(String s,String c,String st)
    {
         this.address=new Address(s,c,st);
         address.getAddressDetails();
    }
    //Constuctor for User class
    public Passenger(String u,String p)
    {
         this.user=new User(u,p);
    }
    //setter and getter method for id attribute
    public void setId(int i)
    {
        this.id=i;
    }
    public int getId()
    {
        return id;
    }
    //Inner class
    static class Contact
    {
        private  String name;
        private  String phoneNumber;
        private  String emailId;
        public Contact(String n,String ph,String e)
        {
            this.name=n;
            this.phoneNumber=ph;
            this.emailId=e;
        }
        //It gives contact details of Passenger. 
        public void getContactDetails()
        {
            System.out.println("name:"+name+"\n phone number:"+phoneNumber+"\n emailid:"+emailId);
        }
        
    }
    //Inner class Address
    static class Address
    {
            private   String street;
            private  String city;
            private  String state;
            Address(String s,String c,String st)
            {
                this.street=s;
                this.city=c;
                this.state=st;
            }
            //It gives address details of Passenger.
            public void getAddressDetails()
            {
            System.out.println("Street:"+street+"\n city:"+city+"\n state:"+state);
            }
    }
    //Inner class
    static class User
    {
            private String username;
            private String password;
            User(String u,String p)
            {
                this.username=u;
                this.password=p;
            }
    }
    //It returns count of passengers.
    public int  getPassengerCount()
    {
         return idCounter;
    }
    //It takes input from user and returns contact obj
    public static  Contact enterContact(String n,String ph,String e)
    {
        contact=new Passenger.Contact(n,ph,e);
        return contact;
    }
    //it takes input from user and return address obj
    public  static Address enterAddress(String s,String c,String st)
    {
        address=new Passenger.Address(s,c,st);
        return address;
    }
    public static  User login(String u,String p)
    {
        
        user=new Passenger.User(u,p);
        if(user.username==u && user.password==p)
        {System.out.println("login Successfully");}
        else
        {System.out.println("Invalid Login Credentials");}
        return user;
    }
    
 }
