package model;

import java.util.Arrays;
import java.util.List;

public class RacerFactory {
    public static List<Racer> getRacers() {
        return
                Arrays.asList(
                        new Racer(
                                new Person("Lewis", "Ham", 36),
                                Arrays.asList(
                                        new RaceHistory(1, "Spain", "MERCEDES"),
                                        new RaceHistory(1, "Belgium", "MERCEDES"),
                                        new RaceHistory(7, "Italy", "MERCEDES")
                                ),
                                57),
                        new Racer(
                                new Person("Max", "Verstap", 28),
                                Arrays.asList(
                                        new RaceHistory(2, "Spain", "RED"),
                                        new RaceHistory(3, "Belgium", "RED"),
                                        new RaceHistory(17, "Italy", "RED")
                                ),
                                33),
                        new Racer(
                                new Person("Lance", "Russel", 36),
                                Arrays.asList(
                                        new RaceHistory(4, "Spain", "BWT"),
                                        new RaceHistory(9, "Belgium", "BWT"),
                                        new RaceHistory(3, "Italy", "BWT")
                                ),
                                29),
                        new Racer(
                                new Person("Valtteri", "Bot", 33),
                                Arrays.asList(
                                        new RaceHistory(3, "Spain", "MERCEDES"),
                                        new RaceHistory(2, "Belgium", "MERCEDES"),
                                        new RaceHistory(5, "Italy", "MERCEDES")
                                ),
                                44),
                        new Racer(
                                new Person("Sebastien", "Veter", 39),
                                Arrays.asList(
                                        new RaceHistory(7, "Spain", "FERRARI"),
                                        new RaceHistory(13, "Belgium", "FERRARI"),
                                        new RaceHistory(17, "Italy", "FERRARI")
                                ),
                                6)
                );
    }
}