// package MiniProject.BusReservation;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class BusDemo {
    public static void main(String args[])
    {
        ArrayList<Bus> buses=new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();

        buses.add(new Bus(1,true,56));
        buses.add(new Bus(2,true,65));
        buses.add(new Bus(3,false,40));


        int userOp=1;
        Scanner sc = new Scanner (System.in);

        for (Bus bus:buses)
        {
            bus.diplayBusInfo();
        }
        boolean run=true;
        int choice;
        //while(userOp==1)
        while(run)
        {
            System.out.print("Enter 1 to Book \nEnter 2 to Exit\nEnter Your Choice : ");
           // userOp=Integer.parseInt(sc.nextLine());
            //System.out.println(userOp+" ");
            choice=sc.nextInt();
            if(choice==1)
            {
                Booking booking=new Booking();
                if(booking.isAvailable(bookings,buses))
                {
                    bookings.add(booking);
                    System.out.println("Your Booking is Confirmed");
                }
                else{
                    System.out.println("Sorry! Bus is full. Try another bus or date ");
                }
            }
            else if(choice==2)
            {
                run=false;
            }
            else
            {
                System.out.println("Invalid Choice ! Try Again....");
            }
        }
    }
}

