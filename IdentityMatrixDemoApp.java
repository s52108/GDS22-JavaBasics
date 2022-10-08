public class IdentityMatrixDemoApp {
    public static void main(String[] args) {
        int groesse = 10;

        int[][] matrix = generateIdentityMatrix(groesse);
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix.length; y++) {
                System.out.print(matrix[x][y] + " | ");
            }
            System.out.println();
        }

    }

    public static int[][] generateIdentityMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;

        }


        return matrix;
    }
}
