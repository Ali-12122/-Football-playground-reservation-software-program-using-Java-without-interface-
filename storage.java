import java.util.*;
public class storage {

    public static Map<playground,String> playgrounds = new HashMap<>();
    public static ArrayList<PlaygroundOwner> playgroundOwners = new ArrayList<>(10);
    public static ArrayList<Player> players = new ArrayList<>(10);
    public static ArrayList<Team> teams = new ArrayList<>(10);
    public static ArrayList<Booking> Bookings  = new ArrayList<>(10);

    public static void displayPlaygrounds(){
        playgrounds.forEach((K,V)->System.out.println("key = " + K.toString() + "status = " + V));
    }

    public static void displayPlaygroundsByLocation(String location){
        for(playground pg : playgrounds.keySet()){
            if(pg.getLocation().equals(location)){
                System.out.println("Playground name: " + pg.getName() +", status: " + playgrounds.get(pg) + ".\n") ;
            }
        }
    }

    public static void displayPlaygroundsByDate(int date){
        for(playground pg : playgrounds.keySet()){
            if(date>= pg.getFirstTimeSlot())
                 System.out.println("Playground " + pg.getName() + " is available from " + pg.getFirstTimeSlot()+":00 to " + pg.getLastTimeSlot()+":00.\n");

        }
    }

    public static void displayPlaygroundOwner(){
        for(int i=0;i<playgroundOwners.size();++i){
            System.out.println(playgroundOwners.get(i).toString() + " \n");
        }
    }

    public static void displayPlayers(){
        for(int i=0;i<players.size();++i){
            System.out.println(players.get(i).toString() + " \n");
        }
    }

    public static void displayTeams(){
        for(int i=0;i<teams.size();++i){
            System.out.println(teams.get(i).toString() + " \n");
        }
    }

    public static void displayBookings(){
        for(int i=0;i<Bookings.size();++i){
            System.out.println(Bookings.get(i).toString() + " \n");
        }
    }

    public static void addPlayground(playground Pg){
        playgrounds.put(Pg,"pending acceptance");
        System.out.println(Pg.getName() + " has been added and is pending acceptance from admins.\n");
    }

    public static void removePlayground(playground Pg){
        playgrounds.remove(Pg);
    }

    public static void suspendPlayground(playground Pg){
        for(playground plgr: playgrounds.keySet()){
            if(plgr.equals(Pg)){
                playgrounds.remove(plgr);
                playgrounds.put(Pg,"suspended");
            }
        }
    }

    public static void activatePlayground(playground Pg){
        for(playground plgr: playgrounds.keySet()){
            if(plgr.equals(Pg)){
                playgrounds.remove(plgr);
                playgrounds.put(Pg,"activated");
            }
        }
    }


    public static void addPlaygroundOwner(PlaygroundOwner Owner){
        playgroundOwners.add(Owner);
        System.out.println("Playground owner"+Owner.getName()+" has been added to the system, they own the playground "+Owner.getPlayground().getName()+".\n");

    }

    public static void addPlayer(Player player){
        players.add(player);
        System.out.println("Player "+player.getName()+" has been added to the system.\n");

    }

    public static PlaygroundOwner getPlaygroundOwnerByPlayground( playground Pg){
        for(int i=0;i<playgroundOwners.size();++i){
            if(playgroundOwners.get(i).getPlayground().equals(Pg)){
                return playgroundOwners.get(i);
            }
        }
        return null;
    }


}
