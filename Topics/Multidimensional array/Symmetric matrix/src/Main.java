import java.util.Arrays;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        int[][] matTrans = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int o = 0; o < n; o++) {
                matrix[i][o] = scanner.nextInt();
                matTrans[o][i] = matrix[i][o];
            }
        }
        System.out.println(Arrays.deepEquals(matrix, matTrans) ? "YES" : "NO");
    }
}
    
