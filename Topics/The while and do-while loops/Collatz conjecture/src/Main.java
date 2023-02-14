import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int accumulator = 1;                   // (1)
        int start =1;
        int end =100;
        for (int i = start; i <= end; i++) {   // (2)
            accumulator *= i;                  // (3)
            System.out.println(accumulator);
        }
        System.out.println(accumulator);

    }
}