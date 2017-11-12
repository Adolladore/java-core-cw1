package control_work;

import java.util.ArrayList;
import java.util.List;

public class Path {
    private Integer pathNumber;
    private List<Stop> stops = new ArrayList<>();
    private List<Bus> buses = new ArrayList<>();

    public List<Bus> getBuses() {
        return buses;
    }

    public void setBuses(List<Bus> buses) {
        this.buses = buses;
    }

    public Path(Integer pathNumber) {
        this.pathNumber = pathNumber;
    }

    public Integer getPathNumber() {
        return pathNumber;
    }

    public void setPathNumber(Integer pathNumber) {
        this.pathNumber = pathNumber;
    }

    public List<Stop> getStops() {
        return stops;
    }

    public void setStops(List<Stop> stops) {
        this.stops = stops;
    }

    public void addStop(Stop stop) {
        stops.add(stop);
    }

    public void addBus(Bus bus) {
        buses.add(bus);
    }
}
