import java.util.Arrays;
import java.util.zip.ZipFile;

public class ArrayDemo1 {
    public static void main(String[] args) {
       /* int[] Array1 = {3, 4, 5};
        int[] Array2 = {7, 1, 3};


        int ergebnis1 = (Array1[0] + Array2[0]);
        int ergebnis2 = (Array1[1] + Array2[1]);
        int ergebnis3 = (Array1[2] + Array2[2]);
        int ergebnis4 = (Array1[0] * Array2[0]);
        int ergebnis5 = (Array1[1] * Array2[1]);
        int ergebnis6 = (Array1[2] * Array2[2]);


        System.out.println("Ergebnis addition: " + ergebnis1 + ", " + ergebnis2 + ", " + ergebnis3);
        System.out.println("Ergebnis multiplikation: " + ergebnis4 + ", " + ergebnis5 + ", " + ergebnis6);

*/
        int[] values1 = new int[3]; //values 1_0, values 1_1, values 1_2
        values1[0] = 3;
        values1[1] = 4;
        values1[2] = 5;

        int[] values2 = {7, 5, 1};

        for (int i = 0; i < values1.length; i++) { //fori + Tabulator + Tabulator
            System.out.println("i1 = " + i + "; value: " + values1[i]);

        }
        for (int i = 0; i < values2.length; i++) {
            System.out.println("i2 = " + i + "; value: " + values2[i]);

        }
        System.out.println("Addition:");
        for (int i = 0; i < values1.length && i < values2.length; i++) {
            int result = values1[i] + values2[i];
            System.out.print(result);
            if (i < values1.length - 1) {
                System.out.print(", ");

            }
        }

        //System.out.println();
        System.out.println("\nMultiplikation:"); // \n = new Line
        for (int i = 0; i < values1.length && i < values2.length; i++) {
            int result = values1[i] * values2[i];

            if (i < values1.length - 1)
                System.out.print(result + ", ");
            else
                System.out.print(result);

        }
        System.out.println("\n\nSumme:");
        int sum = 0;
        for (int i = 0; i < values1.length; i++) {
            sum = sum + values1[i];
        }
        System.out.println("Summe = " + sum);
        System.out.println("Average = " + sum / (values1.length * 1.0));

        System.out.println(Arrays.toString(values1));
        System.out.println(Arrays.toString(values2));
    }
}


