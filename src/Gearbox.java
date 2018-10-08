

public class Gearbox {
    private int maxGears;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }


}
