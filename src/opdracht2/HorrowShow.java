package opdracht2;

public class HorrowShow {
    public static void main (String[] args) {

        class Vampire implements Monster {

            @Override
            public void menace() {
                System.out.println("I'll drink your blood!");
            }
        }

        class Werewolf implements DangerousMonster {

            @Override
            public void destroy(Monster monster) {
                monster.menace();
                System.out.println("Big fight!!!!");
                System.out.println(this.getClass().getSimpleName() + " killed one " + monster.getClass().getSimpleName());
            }

            @Override
            public void menace() {
                System.out.println("I'll destoy you!");
            }
        }
    }
}
