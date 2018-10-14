package opdracht2;

public class HorrowShow {
    public static void main (String[] args) {

        class Vampire implements Monster {

            @Override
            public void menace() {
                System.out.println("I'll drink your blood!");
            }
        }
    }
}
