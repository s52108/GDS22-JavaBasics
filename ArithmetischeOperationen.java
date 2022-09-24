public class ArithmetischeOperationen {

    /**
     * Ausführung aller arithmetischer Operationen und Ausgabe
     *
     * @param args
     */
    public static void main(String[] args) {
        //deklarieren & Initialisieren
        int a = 10;
        int b = 2;
        int Ergebnis;

        //Variablen Ausgeben
        System.out.println("Zahl a = " + a);
        System.out.println("Zahl b = " + b);

        //Addition
        Ergebnis = a + b;
        System.out.println("Zahl a + Zahl b = " + Ergebnis);

        //Subtraktion
        Ergebnis = a - b;
        System.out.println("Zahl a - Zahl b = " + Ergebnis);

        //Multiplikation
        System.out.println("Zahl a * Zahl b = " + (a * b));

        //Division
        //double div = (double) a / (double) b;
        double div = a / (1.0 * b);
        System.out.println("Zahl a / Zahl b = " + div);

        //Restwert/Modolo
        Ergebnis = a % b;
        System.out.println("Zahl a % Zahl b = " + Ergebnis);
//

    }
}
