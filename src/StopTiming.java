import java.util.HashMap;
import java.util.Map;

public class StopTiming {
    private Path path;
    private Map<Stop,Integer> timesFromStopToNext = new HashMap<>();

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    public Map<Stop, Integer> getTimesFromStopToNext() {
        return timesFromStopToNext;
    }

    public void setTimesFromStopToNext(Map<Stop, Integer> timesFromStopToNext) {
        this.timesFromStopToNext = timesFromStopToNext;
    }

    public void addTimeToStop(Stop stop, Integer timeToNextStop) {
        timesFromStopToNext.put(stop,timeToNextStop);

    }

    public Integer getTimeToNextStop(Stop current) {
        return timesFromStopToNext.get(current);
    }
}
