public class BeispieleJava_B8 {
    public static void main(String[] args) {
        int anfang = 0;
        int ende = 10;
        dreieck(anfang, ende);

    }

    public static void dreieck(int a, int e) {

        int counter = 0;

        while (counter <= e) {

            System.out.print(a + " ");

            if (a == counter) {
                a = 0;
                counter++;
                System.out.println(); //Zeilenumbruch
            } else a++;

        }


    }
}
