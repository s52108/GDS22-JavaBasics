public class DemoLoopApp {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 100_000; i++) {

            if (count < 10) {
                if (((i - 1) + i) % 351 == 0) {

                    System.out.println("Zahl = " + i);
                    count++;

                }
            } else return;
        }
    }
}

