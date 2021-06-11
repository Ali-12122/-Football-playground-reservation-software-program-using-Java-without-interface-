public class PlaygroundOwner extends User {

    private playground Playground;
    private double eWallet;

    PlaygroundOwner(){
        Playground=null;
        email=" ";
        name=" ";
        Password=" ";
        ID=0;
        userType=type.playgroundOwner;
        eWallet=0.0;
    }


    PlaygroundOwner(String email, int ID, String name, String Password,double eWallet){
        this.email=email;
        this.name=name;
        this.Password=Password;
        this.ID=ID;
        this.userType=type.playgroundOwner;
        this.eWallet=eWallet;
        Playground=null;
        System.out.println( "Playground owner " + name + " profile has been made.\n");
    }
    public void requestToAddPlayground(int firstTimeSlot, int LastTimeSlot, String location, String name, int playgroundID, double pricePerHour){
        Playground.setTimeslots(firstTimeSlot,LastTimeSlot);
        Playground.setID(ID);
        Playground.setLocation(location);
        Playground.setName(name);
        Playground.setPricePerHour(pricePerHour);

        storage.addPlayground(Playground);
        System.out.println("Playground addition request completed");
    }
    public void setTimeForPlayground(int firstTimeSlot, int LastTimeSlot) {
        Playground.setTimeslots(firstTimeSlot, LastTimeSlot);
        System.out.println("Time slots have been changed to: " + firstTimeSlot + " - " + LastTimeSlot + "\n");
    }

    public void displayPlaygroundInfo(){
        System.out.println("Playground owner "+this.name+" playground's information"+Playground.toString());
    }

    public playground getPlayground(){
        return Playground;
    }

    public void viewMoneyInEWallet(){
        System.out.println("Playground Owner " + this.name + " e-wallet's money.\n");
    }

    public void addMoneyToEWallet(double amount){
        this.eWallet+=amount;
        System.out.println(amount + "E.G.Ps have been added to playground owner " + this.name + "e-wallet.\n");
    }

    public void setPlayground(playground playground) {
        Playground = playground;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
