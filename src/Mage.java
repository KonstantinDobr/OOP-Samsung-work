public class Mage extends Unit {
    private int mana;

    public Mage(String name, int health, int mana) {
        super(name, health);
        this.mana = mana;
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Mana : " + mana);
    }
}
