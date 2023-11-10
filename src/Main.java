public class Main {
    public static void main(String[] args) {
        Unit unit = new Unit("FirstUnit", 100);
<<<<<<< Updated upstream
        unit.printInfo();

        System.out.println();

        Mage mage = new Mage("FirstMage", 100, 200);
        mage.printInfo();
=======
        System.out.println(unit + "\n");

        Mage mage = new Mage("FirstMage", 100, 200);
        System.out.println(mage + "\n");

        Mage clone = new Mage(mage);
        System.out.println(clone + "\n");

        System.out.println(clone == mage);

>>>>>>> Stashed changes
    }
}