public class Tagesabschnitt {
    /**
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
        byte hour = 24;
        String abschnitt = "";

        abschnitt = getDayTimeName(hour);

        //casting
        // abschnitt = getDayTimeName((byte)24);

        System.out.println("Tagesabschnitt = " + abschnitt);

    }

    /**
     * public static void tagesabschnitt(int uhrzeit) {
     * if (uhrzeit >= 0 && uhrzeit <= 24) {
     * <p>
     * if (uhrzeit <= 9 && uhrzeit >= 6) {
     * return ("Früh");
     * } else if (uhrzeit > 9 && uhrzeit < 12) {
     * return ("Vormittag");
     * } else if (uhrzeit >= 12 && uhrzeit < 16) {
     * return ("Nachmittag");
     * } else if (uhrzeit >= 16 && uhrzeit < 20) {
     * return ("Abend");
     * }
     * return ("Nacht");
     * }
     * return ("Keine gültige Uhrzeit");
     * }
     **/
    //publiv stativ return_type (void) name (parameter)
    public static String getDayTimeName(byte time) {
        String abschnitt;

        if (time >= 0 && time <= 24) {

            if (time <= 9 && time >= 6) {
                return ("Früh");
            } else if (time > 9 && time < 12) {
                return ("Vormittag");
            } else if (time >= 12 && time < 16) {
                return ("Nachmittag");
            } else if (time >= 16 && time < 20) {
                return ("Abend");
            }
            return ("Nacht");
        }
        return ("Keine gültige Uhrzeit");
    }
}
