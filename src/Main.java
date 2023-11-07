public class Main {
    public static void main(String[] args) {
        Unit unit = new Unit("FirstUnit", 100);
        unit.printInfo();

        System.out.println();

        Mage mage = new Mage("FirstMage", 100, 200);
        mage.printInfo();
    }
}