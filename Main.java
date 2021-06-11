
import java.util.*;
public class Main {

    public static void main(String args[]) {

            String name1 = "Andrew";
            String name2 = "Mike";
            String name3 = "John";
            String name4 = "Angie";
            String name5 = "Lina";
            String name6 = "Zack";

            String email1 ="Andrew@gmail.com";
            String email2 ="Mike@gmail.com";
            String email3 ="John@gmail.com";
            String email4 ="Angie@gmail.com";
            String email5 ="Lina@gmail.com";
            String email6 ="Zack@gmail.com";

            String password1 = "123456";
            String password2 = "234567";
            String password3 = "345678";
            String password4 = "456789";
            String password5 = "567890";
            String password6 = "678901";

            int ID1 = 1001;
            int ID2 = 1002;
            int ID3 = 1003;
            int ID4 = 1004;
            int ID5 = 1005;
            int ID6 = 2001;

            playground pg = new playground(1,5,"Giza","Playground1", 5001,5.5);

            PlaygroundOwner Owner = new PlaygroundOwner(email6, ID6, name6, password6,0.0);


            Owner.setPlayground(pg);

            ArrayList<Integer> bookedTimeslots = new ArrayList<>(3);
            bookedTimeslots.add(1);
            bookedTimeslots.add(2);
            bookedTimeslots.add(3);

            storage.addPlayground(pg);
            storage.addPlaygroundOwner(Owner);







            Player player1 = new Player(email1,ID1,name1,password1);
            Player player2 = new Player(email2,ID2,name2,password2);
            Player player3 = new Player(email3,ID3,name3,password3);
            Player player4 = new Player(email4,ID4,name4,password4);
            Player player5 = new Player(email5,ID5,name5,password5);

            player1.addMoneyToEWallet(100);
            player2.addMoneyToEWallet(100);
            player3.addMoneyToEWallet(100);
            player4.addMoneyToEWallet(100);
            player5.addMoneyToEWallet(100);

            storage.addPlayer(player1);
            storage.addPlayer(player2);
            storage.addPlayer(player3);
            storage.addPlayer(player4);
            storage.addPlayer(player5);



            Team teamX = new Team("Team1");

            teamX.addTeamMember(player1);
            teamX.addTeamMember(player2);
            teamX.addTeamMember(player3);
            teamX.addTeamMember(player4);
            teamX.addTeamMember(player5);

            Booking booking1 = new Booking(pg,teamX,bookedTimeslots);
            System.out.println(booking1.toString());


        }

}
