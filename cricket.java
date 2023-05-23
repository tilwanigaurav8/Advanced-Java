import java.beans.*;
import java.awt.*;

public class cricket extends Canvas {
    private String teamA;
    private String teamB;
    private int teamARuns;
    private int teamBRuns;
    private int teamAOvers;
    private int teamBOvers;
    private int teamAWickets;
    private int teamBWickets;

    public cricket() {
        setSize(200, 100);
        teamA = "";
        teamB = "";
        teamARuns = 0;
        teamBRuns = 0;
        teamAOvers = 0;
        teamBOvers = 0;
        teamAWickets = 0;
        teamBWickets = 0;
    }

    // getters
    public String getTeamA() {
        return teamA;
    }

    public String getTeamB() {
        return teamB;
    }

    public int getTeamARuns() {
        return teamARuns;
    }

    public int getTeamBRuns() {
        return teamBRuns;
    }

    public int getTeamAOvers() {
        return teamAOvers;
    }

    public int getTeamBOvers() {
        return teamBOvers;
    }

    public int getTeamAWickets() {
        return teamAWickets;
    }

    public int getTeamBWickets() {
        return teamBWickets;
    }

    // setters
    public void setTeamA(String teamA) {
        this.teamA = teamA;
    }

    public void setTeamB(String teamB) {
        this.teamB = teamB;
    }

    public void setTeamARuns(int teamARuns) {
        this.teamARuns = teamARuns;
    }

    public void setTeamBRuns(int teamBRuns) {
        this.teamBRuns = teamBRuns;
    }

    public void setTeamAOvers(int teamAOvers) {
        this.teamAOvers = teamAOvers;
    }

    public void setTeamBOvers(int teamBOvers) {
        this.teamBOvers = teamBOvers;
    }

    public void setTeamAWickets(int teamAWickets) {
        this.teamAWickets = teamAWickets;
    }

    public void setTeamBWickets(int teamBWickets) {
        this.teamBWickets = teamBWickets;
    }

    public void paint(Graphics g) {
        String teamAMsg = teamA + " - " + teamARuns + "/" + teamAWickets + " (" + teamAOvers + " overs)";
        g.drawString(teamAMsg, 10, 10);
        String teamBMsg = teamB + " - " + teamBRuns + "/" + teamBWickets + " (" + teamBOvers + " overs)";
        g.drawString(teamBMsg, 10, 20);
    }
}