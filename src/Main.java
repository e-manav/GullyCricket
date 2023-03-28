import java.security.PublicKey;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Team teamA = new Team("Bihar", new String[]{"Anjli", "Lalia", "Pinki"});
        Team teamB = new Team("M.P.",new String[]{"Ramlal","Shyamlal","HHLal"});
        welcomeUser();
        displayTeamName(teamA,teamB);
        selectPlayerFor1Inning(teamA,teamB);
    }

    public static void welcomeUser(){
        System.out.println("Welcome to gulli Cricket By DM");
    }
    public static void displayTeamName(Team team1, Team team2){
        System.out.println("Players in Team "+team1.getTeamName());
        for (int i =0;i<team1.getPlayers().length;i++){
            System.out.println(i+1 + ". "+ team1.getPlayers()[i]);
        }
        System.out.println("Players in Team "+team2.getTeamName());
        for (int i =0;i<team1.getPlayers().length;i++){
            System.out.println(i+1 + ". "+ team2.getPlayers()[i]);
        }
    }

    public static void selectPlayerFor1Inning(Team team1,Team team2){
        int randomNumber = (int)(Math.random()*3);
        String batsman = team1.getPlayers()[randomNumber];
        System.out.println(batsman);
    }
}