import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;

public class DataStore {
    private List<Path> paths = new ArrayList<>();
    private List<StopTiming> stopsTiming = new ArrayList<>();
    private List<Stop> stops = new ArrayList<>();
    private List<Bus> buses = new ArrayList<>();

    public List<StopTiming> getStopsTiming() {
        return stopsTiming;
    }

    public void setStopsTiming(List<StopTiming> stopsTiming) {
        this.stopsTiming = stopsTiming;
    }

    public DataStore() {
        Stop stop1 = new Stop("Шевченка");
        Stop stop2 = new Stop("Енгельса");
        Stop stop3 = new Stop("Благовісна");
        Stop stop4 = new Stop("Любава");
        Stop stop5 = new Stop("Седова");
        Stop stop6 = new Stop("Театр");
        Stop stop7 = new Stop("Соборна");
        Stop stop8 = new Stop("Упмаш");
        Stop stop9 = new Stop("Університет");
        Stop stop10 = new Stop("Манеж");
        Stop stop11 = new Stop("Ватутіна");

        Bus bus1 = new Bus("1.1", stop1);
        Bus bus2 = new Bus("1.4", stop4);
        Bus bus3 = new Bus("1.6", stop6);
        Bus bus4 = new Bus("2.2", stop2);
        Bus bus5 = new Bus("2.3", stop3);
        Bus bus6 = new Bus("2.9", stop9);
        Bus bus7 = new Bus("3.10", stop10);
        Bus bus8 = new Bus("3.4", stop4);
        Bus bus9 = new Bus("3.7", stop7);
        Bus bus10 = new Bus("4.11" , stop11);
        Bus bus11 = new Bus("4.2", stop2);
        Bus bus12 = new Bus("4.7", stop7);

        StopTiming timingForPath1 = new StopTiming();
        StopTiming timingForPath2 = new StopTiming();
        StopTiming timingForPath3 = new StopTiming();
        StopTiming timingForPath4 = new StopTiming();

        stops.add(stop1);
        stops.add(stop2);
        stops.add(stop3);
        stops.add(stop4);
        stops.add(stop5);
        stops.add(stop6);
        stops.add(stop7);
        stops.add(stop8);
        stops.add(stop9);
        stops.add(stop10);
        stops.add(stop11);

        Path path1 = new Path(1);
        timingForPath1.setPath(path1);
        path1.addStop(stop1);
        timingForPath1.addTimeToStop(stop1,4);
        path1.addStop(stop2);
        timingForPath1.addTimeToStop(stop2,6);
        path1.addStop(stop3);
        timingForPath1.addTimeToStop(stop3,3);
        path1.addStop(stop4);
        timingForPath1.addTimeToStop(stop4,6);
        path1.addStop(stop5);
        timingForPath1.addTimeToStop(stop5,4);
        path1.addStop(stop6);
        timingForPath1.addTimeToStop(stop6,6);
        path1.addStop(stop7);
        timingForPath1.addTimeToStop(stop7,3);

        path1.addBus(bus1);
        path1.addBus(bus2);
        path1.addBus(bus3);

        Path path2 = new Path(2);
        timingForPath2.setPath(path2);
        path2.addStop(stop1);
        timingForPath2.addTimeToStop(stop1, 4);
        path2.addStop(stop2);
        timingForPath2.addTimeToStop(stop2, 6);
        path2.addStop(stop8);
        timingForPath2.addTimeToStop(stop8, 2);
        path2.addStop(stop3);
        timingForPath2.addTimeToStop(stop3, 8);
        path2.addStop(stop6);
        timingForPath2.addTimeToStop(stop6, 2);
        path2.addStop(stop9);
        timingForPath2.addTimeToStop(stop9, 4);

        path1.addBus(bus4);
        path1.addBus(bus5);
        path1.addBus(bus6);

        Path path3 = new Path(3);
        timingForPath3.setPath(path3);
        path3.addStop(stop10);
        timingForPath3.addTimeToStop(stop10, 3);
        path3.addStop(stop9);
        timingForPath3.addTimeToStop(stop9, 7);
        path3.addStop(stop3);
        timingForPath3.addTimeToStop(stop3, 6);
        path3.addStop(stop4);
        timingForPath3.addTimeToStop(stop4, 2);
        path3.addStop(stop6);
        timingForPath3.addTimeToStop(stop6, 8);
        path3.addStop(stop7);
        timingForPath3.addTimeToStop(stop7, 5);


        path1.addBus(bus7);
        path1.addBus(bus8);
        path1.addBus(bus9);

        Path path4 = new Path(4);
        timingForPath4.setPath(path4);
        path4.addStop(stop11);
        timingForPath4.addTimeToStop(stop11, 4);
        path4.addStop(stop8);
        timingForPath4.addTimeToStop(stop11, 3);
        path4.addStop(stop2);
        timingForPath4.addTimeToStop(stop11, 6);
        path4.addStop(stop3);
        timingForPath4.addTimeToStop(stop11, 2);
        path4.addStop(stop5);
        timingForPath4.addTimeToStop(stop11, 4);
        path4.addStop(stop6);
        timingForPath4.addTimeToStop(stop11, 4);
        path4.addStop(stop9);
        timingForPath4.addTimeToStop(stop11, 7);
        path4.addStop(stop7);
        timingForPath4.addTimeToStop(stop11, 3);

        path1.addBus(bus10);
        path1.addBus(bus11);
        path1.addBus(bus12);

        paths.add(path1);
        paths.add(path2);
        paths.add(path3);
        paths.add(path4);

        stopsTiming.add(timingForPath1);
        stopsTiming.add(timingForPath2);
        stopsTiming.add(timingForPath3);
        stopsTiming.add(timingForPath4);
    }

    public List<Path> getPaths() {
        return paths;
    }

    public void setPaths(List<Path> paths) {
        this.paths = paths;
    }

    public List<Stop> getStops() {
        return stops;
    }

    public void setStops(List<Stop> stops) {
        this.stops = stops;
    }

    public List<Bus> getBuses() {
        return buses;
    }

    public void setBuses(List<Bus> buses) {
        this.buses = buses;
    }
}
