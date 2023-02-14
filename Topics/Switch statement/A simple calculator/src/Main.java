import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        long x = scanner.nextLong();
        String action = scanner.next();
        long y = scanner.nextLong();


        switch (action) {
            case "+" -> System.out.println(x + y);
            case "-" -> System.out.println(x - y);
            case "*" -> System.out.println(x * y);
            case "/" -> {
                if (y == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(x / y);
                }
            }
            default -> System.out.println("Unknown operator");
        }
    }
}