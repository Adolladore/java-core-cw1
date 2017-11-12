import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static DataStore dataStore = new DataStore();

    public static void main(String[] args) {
        String currentStop;

        for (Path path : dataStore.getPaths()) {
            System.out.println("Маршрут номер " + path.getPathNumber() + " :");
            for (Stop stop : path.getStops()) {
                System.out.println("\t" + stop.getName());
            }
        }

        System.out.println("На якій ви зупинці? (ведіть назву зупинки)");
        currentStop = input.next();
        for (Path path : dataStore.getPaths()) {
            for (Stop stop : path.getStops()) {
                if (stop.getName().equals(currentStop)) {
                    System.out.println("Через цю зупинку проходить маршрут " + path.getPathNumber());
                    Bus closestBus = findClosestBus(stop);
                    if (closestBus != null) {
                        System.out.println("Найближчий автобус :" + closestBus.getName());
                    }
                }
            }
        }
    }

    private static Bus findClosestBus(Stop stop) {
        Bus closestBus = null;
        Integer minTime = Integer.MAX_VALUE;
        for (Path path : dataStore.getPaths()) {
            Integer stopIndex = path.getStops().indexOf(stop);
            for (Bus bus : path.getBuses()) {

                for (int i = stopIndex; i >= 0; i--) {
                    if (bus.getCurrentStop().equals(path.getStops().get(i))) {
                        for (StopTiming stopTiming : dataStore.getStopsTiming()) {
                            if (stopTiming.getPath().equals(path)) {
                                if (stopTiming.getTimesFromStopToNext().get(stop) < minTime) {
                                    minTime = stopTiming.getTimesFromStopToNext().get(stop);
                                    closestBus = bus;
                                }
                            }
                        }
                    }
                }
            }
        }
        return closestBus;
    }

}
