import java.util.*;
public class playground {

    private Map<Integer,String> timeslots = new HashMap<>();
    private String location;
    private String name;
    private int ID;
    private int firstTimeSlot;
    private int lastTimeSlot;
    private double pricePerHour;

    playground(int FirstTimeSlot, int LastTimeSlot, String location, String name, int playgroundID,double pricePerHour){

        if(FirstTimeSlot<1 || LastTimeSlot >24){
            if(FirstTimeSlot<1){
                System.out.println("The first time slot cannot be less than 1\n");
                System.exit(0);
            }
            else if(LastTimeSlot>24){
                System.out.println("The Last time slot cannot be greater than 24\n");
                System.exit(0);
            }
        }
        for(int i=FirstTimeSlot;i<=LastTimeSlot;++i){
            timeslots.put(i,"Free");
        }
        assert(pricePerHour>0);
        this.pricePerHour=pricePerHour;
        this.firstTimeSlot=FirstTimeSlot;
        this.lastTimeSlot=LastTimeSlot;
        this.location=location;
        this.name=name;
        this.ID=playgroundID;
    }
    public void setTimeslots(int FirstTimeSlot, int LastTimeSlot){
        if(FirstTimeSlot<1 || LastTimeSlot >24){
            if(FirstTimeSlot<1){
                System.out.println("The first time slot cannot be less than 1\n");
                System.exit(0);
            }
            else if(LastTimeSlot>24){
                System.out.println("The Last time slot cannot be greater than 24\n");
                System.exit(0);
            }
        }
        for(int i=FirstTimeSlot;i<=LastTimeSlot;++i){
            timeslots.put(i,"Free");
        }
        this.firstTimeSlot=FirstTimeSlot;
        this.lastTimeSlot=LastTimeSlot;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Map<Integer,String> getTimeSlots(){
        // this function returns a Map
        // return it in an another Map
        // ex. : Map<Integer,String> map = Playground25.getTimeSlots
        // the map data structure was used due to its efficiency and versatility.
        return (timeslots);
    }

    public double getPricePerHour() { return pricePerHour;}

    public void setPricePerHour(double pricePerHour) { this.pricePerHour = pricePerHour;}

    public int getFirstTimeSlot(){return firstTimeSlot;}

    public int getLastTimeSlot(){return lastTimeSlot;}

    public String getLocation(){return location;}

    public int getID() { return ID;}

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "playground{ " +
                "timeslots=" + timeslots +
                ", location = '" + location + '\'' +
                ", name = '" + name + '\'' +
                ", ID = " + ID +
                ", Price Per Hour" + pricePerHour +
                '}';
    }
    public playground getPlaygroundByName(String name){
        if(this.name.equals(name)){
            return this;
        }
        else return null;
    }

    public playground getPlaygroundByLocation(String location){
        if(this.location.equals(location)){
            return this;
        }
        else return null;
    }

    public playground getPlaygroundByID(int ID){
        if(this.ID==ID){
            return this;
        }
        else return null;
    }

    public playground getPlaygroundsByTime(int date){
        for(int i: timeslots.keySet()){
            if(date==i){
                return this;
            }
        }
        return null;
    }

    public void changeStatusToBooked(int i){
       timeslots.put(i,"booked");
    }
}
