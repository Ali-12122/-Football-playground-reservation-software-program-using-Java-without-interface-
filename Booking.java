import java.util.ArrayList;

public class Booking {

    private playground Playground;
    private Team team;
    private ArrayList<Integer> bookedTimeSlots;
    private double amountPaid;

    Booking(){
        Playground=null;
        team=null;
        bookedTimeSlots=null;
        amountPaid=0;
    }

    Booking(playground Playground,Team team, ArrayList<Integer> bookedTimeSlots, double amountPaid){
        this.Playground=Playground;
        this.bookedTimeSlots=bookedTimeSlots;
        this.team=team;
        this.amountPaid=amountPaid;
        for(int i=0;i<bookedTimeSlots.size();++i){
            Playground.changeStatusToBooked(bookedTimeSlots.get(i));
        }
    }
    Booking(playground Playground,Team team, ArrayList<Integer> bookedTimeSlots){
        this.Playground=Playground;
        this.bookedTimeSlots=bookedTimeSlots;
        this.team=team;
        amountPaid=Playground.getPricePerHour()*bookedTimeSlots.size();
        for(int i=0;i<bookedTimeSlots.size();++i){
            double eachPlayerPays = amountPaid/team.getTeamMembers().size();
            team.getTeamMembers().get(i).payForPlayground(eachPlayerPays,Playground);
        }
        for(int i=0;i<bookedTimeSlots.size();++i){
            Playground.changeStatusToBooked(bookedTimeSlots.get(i));
        }
    }

    public ArrayList<Integer> getBookedTimeSlots() {
        return bookedTimeSlots;
    }

    public playground getPlayground() {
        return Playground;
    }

    public Team getTeam() {
        return team;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public void setBookedTimeSlots(ArrayList<Integer> bookedTimeSlots) {
        this.bookedTimeSlots = bookedTimeSlots;
    }

    public void setPlayground(playground playground) {
        Playground = playground;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void bookTimeSlot(){
        for(int i=0;i<bookedTimeSlots.size();++i){
            Playground.changeStatusToBooked(bookedTimeSlots.get(i));
        }
    }

    @Override
    public String toString() {
        return "Booking{" +
                " Playground = " + Playground +
                ", team = " + team.toString() +
                ", bookedTimeSlots =" + bookedTimeSlots +
                ", amountPaid = " + amountPaid +
                '}';
    }
}
