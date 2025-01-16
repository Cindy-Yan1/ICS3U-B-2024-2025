package day3;

public class Scoreboard {

    private String team1;
    private String team2;
    private int score1;
    private int score2;
    private boolean activeTeam;

    public Scoreboard(String team1, String team2){
        this.team1 = team1;
        this.team2 = team2;
        score1 = 0;
        score2 = 0;
        activeTeam = true;
    }

    public String getScore(){
        if (activeTeam){
            return score1 + "-" + score2 + "-" + team1;
        }

        else{
            return score1 + "-" + score2 +"-" + team2;
        }
    }

    public void recordPlay(int point){
        if (point > 0){
            if(activeTeam){
                team1 += point;
            }
            else{
                team2 += point;
            }
        }

        else{
            activeTeam = !activeTeam; 
        }
        
    }
}
