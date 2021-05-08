package m_task_02;

import model.Racer;
import model.RacerFactory;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Show a list of racers from "MERCEDES"
// Answer: Lewis, Valtteri

public class App {
    public static void main(String[] args) {

        final List<Racer> racers = RacerFactory.getRacers();

//        String mercedes = IntStream.range(0, racers.size() - 1)
//                .filter(i ->
//                        racers.get(i).getRaceHistory()
//                                .get(0).getTeam().equals("MERCEDES")
//                )
//                .mapToObj(i -> racers.get(i)
//                        .getPerson().getFirstName())
//                .collect(Collectors.joining(", "));
//
//        System.out.println(mercedes);

        List<String> mercedes = racers.stream()
                .filter(racer -> racer.getRaceHistory()
                        .stream()
                        .anyMatch(raceHistory -> raceHistory.getTeam()
                                .equals("MERCEDES")))
                .map(racer -> racer.getPerson().getFirstName())
                .collect(Collectors.toList());
        System.out.println(mercedes);
    }
}