public class BeispieleJava_B9 {
    public static void main(String[] args) {
        double kontostand = 1000;
        double zinsen = 1;
        int laufzeit = 10;
        System.out.println();
        System.out.println("Kontostand = " + kontostand);
        System.out.println("Zinsen = " + zinsen);
        System.out.println("Laufzeit = " + laufzeit);
        System.out.println();

        for (int i = 0; i <= laufzeit; i++) {
            System.out.println("Kontostand Jahr " + i + ": " + kontostand);
            kontostand = calcInterests(kontostand, zinsen);

        }

    }

    public static double calcInterests(double balance, double interest) {
        return balance * (1 + (interest / 100));
    }
}
