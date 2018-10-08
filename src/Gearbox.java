import java.util.ArrayList;
import java.util.List;

public class Gearbox {
    private int maxGears;
    private boolean clutchIsIn;
    private List<Gear> gears = new ArrayList<>();
    private int currentGear;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;

        for (int i = 0; i < maxGears; i++) {
            Gear gear = new Gear();
            gear.setNumber(i + 1);
            gear.setRatio(5.3 * gear.getGearNumber());
            gears.add(gear);
        }
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(Gear gear) {
        gears.add(gear);
    }

    public void changeGear(int newGear) {
        if ((newGear > 0 && newGear <= maxGears) && clutchIsIn) {
            this.currentGear = newGear;
            System.out.println(" Gear " + newGear + "selected");
        } else {
            System.out.println("gggrrrr");
            this.currentGear = 0;
        }
    }


    private class Gear {
        private int gearNumber;
        private double ratio;

        public double driveSpeed(int revs) {
            return revs * ratio;
        }

        public void setNumber(int number) {
            this.gearNumber = number;
        }

        public int getGearNumber() {
            return gearNumber;
        }

        public void setRatio(double ratio) {
            this.ratio = ratio;
        }
    }


}
