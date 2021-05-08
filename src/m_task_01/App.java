package m_task_01;

import model.Racer;
import model.RacerFactory;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

// Show a list of racers' names
// Answer: Lewis, Max, Lance, Valtteri, Sebastien

public class App {
    public static void main(String[] args) {

        final List<Racer> racers = RacerFactory.getRacers();

        String collect = racers.stream()
                .map(racer -> racer.getPerson().getFirstName())
                .filter(Objects::nonNull)
                .collect(Collectors.joining(", "));
        System.out.println(collect);
    }
}