package model;

public class RaceHistory {
    private int finishPosition;
    private String raceCountry;
    private String team;

    public RaceHistory(int finishPosition, String raceCountry, String team) {
        this.finishPosition = finishPosition;
        this.raceCountry = raceCountry;
        this.team = team;
    }

    public int getFinishPosition() {
        return finishPosition;
    }

    public String getRaceCountry() {
        return raceCountry;
    }

    public String getTeam() {
        return team;
    }

    public String toString() {
        return this.team;
    }
}
