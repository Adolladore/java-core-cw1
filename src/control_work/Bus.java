package control_work;

public class Bus {
    private String name;
    private Stop currentStop;

    public Bus(String name, Stop currentStop) {
        this.name = name;
        this.currentStop = currentStop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stop getCurrentStop() {
        return currentStop;
    }

    public void setCurrentStop(Stop currentStop) {
        this.currentStop = currentStop;
    }
}
