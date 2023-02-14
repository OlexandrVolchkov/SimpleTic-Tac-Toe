import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int length = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i < length; i++){
            int enteredNum = scanner.nextInt();
            if (enteredNum % 6 == 0) {
                sum = sum + enteredNum;
            }
        }

        System.out.println(sum);
    }
}