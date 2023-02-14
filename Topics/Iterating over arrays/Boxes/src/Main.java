import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int[] boxOne = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        int[] boxTwo = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

        Arrays.sort(boxOne);
        Arrays.sort(boxTwo);


        int counterForBoxOne = 0;
        int counterForBoxTwo = 0;

        for (int i = 0; i < 3; i++){
            if (boxOne[i]>boxTwo[i]){
                counterForBoxOne++;
            } else if (boxOne[i]<boxTwo[i]) {
                counterForBoxTwo++;
            }
        }

        if(counterForBoxOne == 3) {
                System.out.println("Box 1 > Box 2");
            } else if (counterForBoxTwo == 3) {
                System.out.println("Box 1 < Box 2");
            } else {
                System.out.println("Incompatible");
        }
    }
}