public class TwoDimArrayDemoApp {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;

        int[] oneDim = new int[x]; // 1 Dimensional
        int[][] twoDim = new int[x][y]; // 2 Dimensional
        // int[][][] threeDim = new int[2][3][5]; // 3 Dimensional

        twoDim[0][0] = 1;
        twoDim[0][1] = 7;
        twoDim[2][3] = 9;

        /*
        for (int dimX = 0; dimX < twoDim.length; dimX++) {
            System.out.print(twoDim[dimX][0] + " | ");
        }
        System.out.println();
        for (int dimX = 0; dimX < twoDim.length; dimX++) {
            System.out.print(twoDim[dimX][1] + " | ");
        }
        System.out.println();
        for (int dimX = 0; dimX < twoDim.length; dimX++) {
            System.out.print(twoDim[dimX][2] + " | ");
        }
*/
        for (int dimX = 0; dimX < twoDim.length; dimX++) {
            for (int dimY = 0; dimY < twoDim[dimX].length; dimY++) {
                System.out.print(twoDim[dimX][dimY] + " | ");
            }
            System.out.println();
        }
    }
}
