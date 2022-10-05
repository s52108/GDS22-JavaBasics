public class TurmDemo {
    public static void main(String[] args) {
        int zahl = 2;
        int durchgang = 9;
        turmrechnen(zahl, durchgang);
    }

    public static void turmrechnen(int zahl, int durchgang) {
        for (int i = 2; i <= durchgang; i++) {

            int summ = zahl * i;
            System.out.println(zahl + " * " + i + " = " + summ);
            zahl = summ;
        }
    }
}
