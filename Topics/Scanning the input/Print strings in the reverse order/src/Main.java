import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String slova[] = {"", "", ""};

        for(int i=2; i>=0; i--){
            slova[i] = scanner.nextLine();
        }


        for(int i=0; i<3; i++){
            System.out.println(slova[i]);
        }
    }
}