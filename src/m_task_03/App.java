package m_task_03;

import model.Racer;
import model.RacerFactory;

import java.util.List;

// Show first two racers like name-points
// Answer: Lewis-57, Max-33

public class App {
    public static void main(String[] args) {

        final List<Racer> racers = RacerFactory.getRacers();

        racers.stream()
                .limit(2)
                .map(i -> i.getPerson().getFirstName()
                + "-" + i.getPoints())
                .forEach(System.out::println);
    }
}
