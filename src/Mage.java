public class Mage extends Unit {
    private int mana;

    public Mage(String name, int health, int mana) {
        super(name, health);
        this.mana = mana;
    }
<<<<<<< Updated upstream
=======

    public Mage(Mage mage) {
        super(mage);
        this.mana = mage.mana;
    }

>>>>>>> Stashed changes
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Mana : " + mana);
    }
}
