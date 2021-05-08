package m_task_04;

import model.Racer;
import model.RacerFactory;

import java.util.Comparator;
import java.util.List;

// Show a list of racers sorted by age
// Answer: Max, Valtteri, Lewis, Lance, Sebastien

public class App {
    public static void main(String[] args) {

        final List<Racer> racers = RacerFactory.getRacers();

        racers.stream()
                .sorted(Comparator.comparingInt(p ->
                        p.getPerson().getAge()))
                .map(i -> i.getPerson().getFirstName())
                .forEach(System.out::println);
    }
}
