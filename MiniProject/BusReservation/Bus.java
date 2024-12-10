// package MiniProject.BusReservation;

public class Bus {
    private int busNo;//get 
    private boolean AC;//get and set
    private int busCapacity;//get and set
    Bus(int busNo,Boolean AC,int busCapacity)
    {
        this.busNo=busNo;
        this.AC=AC;
        this.busCapacity=busCapacity;
    }
    public int getBusCapacity(){ //access method
        return busCapacity;
    }
    public void setBusCapacity(int busCapacity){ //mulator
        this.busCapacity = busCapacity;
    }
    public int getBusNo() {//access method
        return busNo;
    }
    public boolean getAC()//access method
    {
        return AC;
    }
    public void setAC(boolean AC) {//mulator
        this.AC = AC;
    }
    public void diplayBusInfo()
    {
        System.out.println("Bus Number : "+busNo+" AC : "+AC+" BusCapacity : "+busCapacity);
    }
}
