import static java.lang.Math.max;

public class Unit {
    private String name;
    private int health;

    public Unit(String name, int health) {
        this.health = max(0, health);
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Name : " + name);
        System.out.println("Health : " + health);
    }
}
