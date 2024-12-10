// package MiniProject.BusReservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
    String passengerName;
    int busNo;
    Date date;
    Booking()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Passenger Name : ");
        passengerName=sc.nextLine();
        System.out.println("Enter the Bus Number : ");
        busNo=sc.nextInt();
        System.out.println("Enter the Date dd-mm-yyyy : ");
        String dateInput = sc.next();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        
        try{
            date=dateFormat.parse(dateInput);
        }
        catch(ParseException e)
        {
            e.printStackTrace();
        }
        sc.close();
    }
    public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses)
    {   
        int capacity=0;
        for (Bus bus:buses)
        {
            if(bus.getBusNo() == busNo)
            {
                capacity=bus.getBusCapacity();
            }
        }

        //checking how many people get booked in the same date and bus
        int booked=0;
        for(Booking b:bookings)
        {
            if(b.busNo == busNo && b.date.equals(date))
            {
                booked++;
            }
        }
        return booked<capacity?true:false;
    }
}
