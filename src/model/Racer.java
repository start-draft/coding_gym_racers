package model;

import java.util.List;

public class Racer {
    private int points;
    private Person person;
    private List<RaceHistory> raceHistory;

    public Racer(Person person, List<RaceHistory> raceHistory, int points) {
        this.person = person;
        this.raceHistory = raceHistory;
        this.points = points;
    }

    public  String toString() {
        return this.getPerson().getFirstName();
    }

    public Person getPerson() {
        return person;
    }

    public int getPoints() {
        return points;
    }

    public List<RaceHistory> getRaceHistory() {
        return raceHistory;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
