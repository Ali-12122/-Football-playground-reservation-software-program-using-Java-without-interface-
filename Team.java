import java.util.*;
public class Team{

    private ArrayList<Player> teamMembers = new ArrayList<Player>(0);
    private String teamName;

    Team(){
        teamName=" ";
    }
    Team(String teamName){
        this.teamName=teamName;
    }

    Team(ArrayList<Player> teamMembers, String teamName){
        assert(teamMembers.size()<=11);
        this.teamMembers=teamMembers;
        this.teamName=teamName;
    }

    public ArrayList<Player> getTeamMembers() {
        return teamMembers;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }


    public void setTeamMembers(ArrayList<Player> teamMembers) {
        assert(teamMembers.size()<=11);
        this.teamMembers = teamMembers;
    }

    public void addTeamMember(Player teamMember){
        assert(teamMembers.size()<11);
        teamMembers.add(teamMember);
    }

    public void deleteTeamMember(Player teamMember){
        teamMembers.remove(teamMember);
    }


    public void displayTeamMember(){
        for(int i=0;i<teamMembers.size();++i){
            System.out.println((teamMembers.get(i).toString()));
        }
    }
}
