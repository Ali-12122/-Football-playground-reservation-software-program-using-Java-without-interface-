import java.util.*;
public class Player extends User{

    private double eWallet;


    Player(){
        email=" ";
        name=" ";
        Password=" ";
        ID=0;
        userType= type.player;
    }

    Player(String email, int ID, String name, String password){
        this.email=email;
        this.name=name;
        this.Password=Password;
        this.ID=ID;
        userType= type.player;
    }

    // bookPlayground

    public void payForPlayground(double amount, playground Pg){
       while(true){
           try{
               Objects.requireNonNull(storage.getPlaygroundOwnerByPlayground(Pg)).addMoneyToEWallet(amount);
               System.out.println(amount + " has been paid for the booking of playground" + Pg.getName() );
               break;
           }catch (NullPointerException e){
               System.out.println("please try again, playground was not found.\n");
           }
       }
    }
    public void displayPlaygrounds(){
        storage.displayPlaygrounds();
    }

    public void displayPlaygroundsByLocation(String location){
        storage.displayPlaygroundsByLocation(location);
    }

    public void displayPlaygroundsByDate(int date){
        storage.displayPlaygroundsByDate(date);
    }

    public void createTeam(String teamName){
        new Team(teamName)  ;
    }

    public void viewMoneyInEWallet(){
        System.out.println("Player "+getName()+" has "+eWallet+"EGPs in his eWallet.\n");
    }

    public void addMoneyToEWallet(double amount) {
        this.eWallet += amount;
    }

    @Override
    public String toString() {
        return "Player{" +
                "eWallet=" + eWallet +
                "email='" + this.email + '\'' +
                ", name='" + this.name + '\'' +
                ", Password='" + this.Password + '\'' +
                ", ID=" + this.ID +
                ", userType=" + this.userType +
                '}';
    }
}
