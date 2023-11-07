public class Mage extends Unit {
    private int mana;

    public Mage(String name, int health, int mana) {
        super(name, health);
        this.mana = mana;
    }

    @Override
    public String toString() {
        return super.toString() + ", mana=" + mana;
    }
}
