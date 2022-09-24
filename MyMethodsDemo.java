public class MyMethodsDemo {

    public static void main(String[] args) {
    printHallo();
    String msg = "Ich bin eine Nachricht";
    printMessage(msg);

    int one = giveMeOne();
    System.out.println(one);

    System.out.println(giveMeOne());

    int result = add(2,3);
    System.out.println(result);
    System.out.println(add(5,6));

        System.out.println(add(2,giveMeOne()));
        //erster Schritt
        //System.out.println((add(2,1)));
        //System.out.println(3);



    }

    /**
     * Schreibe Hallo auf die Konsole
     */
    public static void printHallo() {
        System.out.println("Hallo");
    }
    /**
     * Schreibe eine Nachricht auf die Konsole
     */
    public static void printMessage(String message) {
        //soutv + TAB
        System.out.println("message = " + message);
    }

    /**
     * Gib mir 1 zurück
     * @return immer 1
     */
    public static int giveMeOne(){
        return 1;
    }

    public static int add(int a, int b)    {
        int result = a + b;
        return result;
        //return a + b // andere Möglichkeit
    }

}
