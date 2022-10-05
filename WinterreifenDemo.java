public class WinterreifenDemo {
    public static void main(String[] args) {
        int temp = 7;
        boolean schnee = false;

        if (isWinterreifenPflicht(temp, schnee)) {
            System.out.println("Bitte Winterreifen verwenden.");
        } else System.out.println("Winterreifen sind nicht erforderlich.");

    }

    public static boolean isWinterreifenPflicht(int temperatur, boolean schneeFahrbahn) {
        boolean winterreifen = false;
        if (schneeFahrbahn && temperatur < 8) {
            winterreifen = true;
        } else if (temperatur < 0) {
            winterreifen = true;
        }
        return winterreifen;

    }
}
