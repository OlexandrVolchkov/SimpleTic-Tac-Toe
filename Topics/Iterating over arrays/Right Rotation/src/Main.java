import java.util.Collection;
import java.util.Scanner;
import java.util.Arrays;

class Main {
    // implement me
    private static void rotate(int[] arr, int steps) {
        for (int i = 0; i < steps; i++) {
            int z = arr[arr.length - 1];
            for (int u = arr.length -1 ; u >= 1; u--){
                arr[u] = arr[u - 1];
            }
            arr[0] = z;
        }
    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}