public class Team {
    private String teamName;
    private String[] players;
    private int totalScore;

    public Team(String teamName,String[] players) {
        this.teamName = teamName;
        this.players=players;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public String getTeamName() {
        return teamName;
    }

    public String[] getPlayers() {
        return players;
    }

    public  int getTotalScore(){
        return this.totalScore;
    }
}
