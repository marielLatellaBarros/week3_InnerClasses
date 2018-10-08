import java.util.ArrayList;
import java.util.List;

public class Gearbox {
    private int maxGears;
    private boolean clutchIsIn;
    private List<Gear> gears = new ArrayList<>();

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(Gear gear) {
        gears.add(gear);
    }

    private class Gear {
        private int gearNumber;
        private double ratio;

        public double driveSpeed(int revs) {
            return revs * ratio;
        }
    }




}
