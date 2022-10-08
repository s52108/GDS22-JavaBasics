public class DemoApp {
    public static void main(String[] args) {
        boolean schouldRun = true;
        int counter = 0;

        while (schouldRun/* == true*/) {
            System.out.println("Die Schleife läuft");
            counter++;

            if (counter > 1_000) {
                //schouldRun = false;
                //break;
                //return;
                continue;
            }
            System.out.println("after break");
        }
        System.out.println("after loop");
    }
}
