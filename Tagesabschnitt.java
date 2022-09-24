public class Tagesabschnitt {
    public static void main(String[] args) {
int uhrzeit = 0;
        System.out.println("Uhrzeit = " + uhrzeit);
        System.out.println("Tagesabschnitt = " + tagesabschnitt(uhrzeit));
    }

    public static String tagesabschnitt(int a){
        if (a <= 9 && a >=6)
        {
            return ("Früh");
        }
        else if (a > 9 && a < 12){
            return ("Vormittag");
        }
        else if (a >= 12 && a < 16){
            return ("Nachmittag");
        }
        else if (a >= 16 && a < 20) {
            return ("Abend");
        }
        else if (a>= 20 && a < 24 || a >=0 && a < 6){
            return ("Nacht");
        }
        return ("Keine Gültige Uhrzeit");
    }
}
