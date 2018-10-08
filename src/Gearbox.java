

public class Gearbox {
    private int maxGears;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public class Gear {
        private int gearNumber;
        private double ratio;

        public double driveSpeed(int revs) {
            return revs * ratio;
        }
    }




}
