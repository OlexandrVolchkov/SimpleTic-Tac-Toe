import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        System.out.println(findMaxNumPosition());



    }

    public static int[][] getMatrix(){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i<n; i++){
            for (int y = 0; y<m; y++){
                matrix[i][y] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static String findMaxNumPosition(){
        int[][] matrix = getMatrix();

        int maxNum = matrix[0][0];
        for (int i = 0; i<matrix.length; i++){
            for (int y = 0; y<matrix[i].length; y++){
                if (maxNum < matrix[i][y]){
                    maxNum = matrix[i][y];
                }
            }
        }

        String result = "";
        int count = 0;

        for (int i = 0; i<matrix.length; i++){
            if (count != 1){
                for (int y = 0; y<matrix[i].length; y++){
                    if (maxNum == matrix[i][y]){
                        result = ( i + " " + y);
                        count = 1;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        return result;
    }
}