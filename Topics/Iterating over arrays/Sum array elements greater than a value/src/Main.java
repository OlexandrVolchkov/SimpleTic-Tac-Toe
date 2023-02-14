import java.sql.Array;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int sizeArr = scanner.nextInt();

        int arr[] = new int[sizeArr];
        for (int i = 0; i < sizeArr; i++){
            arr[i] = scanner.nextInt();
        }

        int limNum = scanner.nextInt();

        int result = 0;

        for (int a : arr){
            if(a > limNum){
                result = result + a;
            }
        }

        System.out.println(result);
    }
}