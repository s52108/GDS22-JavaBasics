public class Tagesabschnitt {
    /**
     *
     * Retourniere Tagesabschnitt abhängig bon der Uhrzeit
     * 6-9 (exkl) -> Früh
     * 9-12 (exkl) -> Vormittag
     * 12-16 (exkl) -> Nachmittag
     * 16-20 (exkl) -> Abend
     * 20-06 (exkl) -> Nacht
     *
     * @param args Programmargumente (nicht verwendet)
     */
    public static void main(String[] args) {
        byte uhrzeit = 14;
        System.out.println("Uhrzeit = " + uhrzeit);
        System.out.println("Tagesabschnitt = " + tagesabschnitt(uhrzeit));
    }

    public static String tagesabschnitt(int uhrzeit) {
        if (uhrzeit >= 0 && uhrzeit <= 24) {

            if (uhrzeit <= 9 && uhrzeit >= 6) {
                return ("Früh");
            } else if (uhrzeit > 9 && uhrzeit < 12) {
                return ("Vormittag");
            } else if (uhrzeit >= 12 && uhrzeit < 16) {
                return ("Nachmittag");
            } else if (uhrzeit >= 16 && uhrzeit < 20) {
                return ("Abend");
            }
            return ("Nacht");
        }
        return ("Keine gültige Uhrzeit");
    }
}
