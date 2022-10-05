public class BeispieleJava_B5 {
    public static void main(String[] args) {
        int year = 2100;
        isLeapYear(year);

    }

    public static void isLeapYear(int year) {
        for (int a = 1; a <= year; a++) {

            if (a % 4 == 0 && a % 100 != 0) {
                System.out.println(+a + " ist ein Schaltjahr.");
            } else if (a % 4 == 0 && a % 400 == 0) {
                System.out.println(+a + " ist ein Schaltjahr.");
            } else System.out.println(+a + " ist kein Schaltjahr.");
        }


    }
}


