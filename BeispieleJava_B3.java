public class BeispieleJava_B3 {
    public static void main(String[] args) {
        int a = 100;

        System.out.println("Summe der Zahlen von 1 bis " + a + " = " + summe(a));


    }

    public static int summe(int a) {

        int summe = 0;

        for (int b = 1; b <= a; b++) {
            summe = summe + b;
        }

        return summe;
    }

}
