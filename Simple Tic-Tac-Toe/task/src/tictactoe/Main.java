package tictactoe;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] field = getField();
        printFieldCurrent(field);

        int i = 0;
        while (i < 9) {
            i++;
            newTurn(field);
            if (whoWin(field).equals("X wins")){
                System.out.println(whoWin(field));
                break;
            } else if (whoWin(field).equals("Impossible")){
                System.out.println(whoWin(field));
                break;

            } else if (whoWin(field).equals("Draw")){
                System.out.println(whoWin(field));
                break;

            }
            i++;
            opponentTurn(field);
            if (whoWin(field).equals("O wins")){
                System.out.println(whoWin(field));
                break;
            } else if (whoWin(field).equals("Impossible")){
                System.out.println(whoWin(field));
                break;

            } else if (whoWin(field).equals("Draw")){
                System.out.println(whoWin(field));
                break;

            }
        }
    }

    public static char[][] getField() {
        return new char[][]{{'_', '_', '_'}, {'_', '_', '_'}, {'_', '_', '_'}};
    }

    public static String whoWin(char[][] field) {
        int xs = 0;
        int os = 0;
        boolean xxx = false;
        boolean ooo = false;

        for (char[] chars : field) {
            for (char aChar : chars) {
                if (aChar == 'X') {
                    xs++;
                } else if (aChar == 'O') {
                    os++;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            int row = 0;
            int clm = 0;
            int mDiag = 0;
            int aDiag = 0;

            for (int j = 0; j < 3; j++) {
                row += field[i][j];
                clm += field[j][i];
                mDiag += field[j][j];
                aDiag += field[j][2 - j];
            }

            // ASCII value for X is 88 (X+X+X is 264)
            // ASCII value for O is 79 (O+O+O is 237)
            xxx = xxx || row == 264 || clm == 264 || mDiag == 264 || aDiag == 264;
            ooo = ooo || row == 237 || clm == 237 || mDiag == 237 || aDiag == 237;
        }

        String result = Math.abs(xs - os) > 1 || xxx && ooo ? "Impossible"
                : xxx ? "X wins"
                : ooo ? "O wins"
                : xs + os == 9 ? "Draw"
                : "Game not finished";

        return result;
    }

    public static void printFieldCurrent(char[][] field) {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.printf("| %c %c %c |%n", field[i][0], field[i][1], field[i][2]);
        }
        System.out.println("---------");
    }

    public static void newTurn(char[][] field) {
        char[] coords = getCoord();

        if (field[Character.getNumericValue(coords[0]) - 1][Character.getNumericValue(coords[1]) - 1] == '_') {
            field[Character.getNumericValue(coords[0]) - 1][Character.getNumericValue(coords[1]) - 1] = 'X';
        } else if (field[Character.getNumericValue(coords[0]) - 1][Character.getNumericValue(coords[1]) - 1] == 'O' ||
                field[Character.getNumericValue(coords[0]) - 1][Character.getNumericValue(coords[1]) - 1] == 'X') {
            System.out.println("This cell is occupied! Choose another one!");
            newTurn(field);
        }
        printFieldCurrent(field);
    }

    public static void opponentTurn(char[][] field) {
        Random random = new Random();
        while (true){
            int i = random.nextInt(3);
            int j = random.nextInt(3);
            if (field[i][j] == '_'){
                field[i][j] = 'O';
                break;
            }
        }
        printFieldCurrent(field);
    }

    public static char[] getCoord() {
        Scanner scanner = new Scanner(System.in);
        String coord;
        char[] charsCoord;
        while (true) {
            coord = scanner.nextLine().replace(" ", "");
            charsCoord = coord.toCharArray();
            if (Character.isLetter(charsCoord[0]) | Character.isLetter(charsCoord[1])) {
                System.out.println("You should enter numbers!");
            } else if (Character.getNumericValue(charsCoord[0]) <= 0 |
                    Character.getNumericValue(charsCoord[0]) >= 4 |
                    Character.getNumericValue(charsCoord[1]) <= 0 |
                    Character.getNumericValue(charsCoord[1]) >= 4) {
                System.out.println("Coordinates should be from 1 to 3!");
            } else if (Character.getNumericValue(charsCoord[0]) > 0 &
                    Character.getNumericValue(charsCoord[0]) < 4 &
                    Character.getNumericValue(charsCoord[1]) > 0 &
                    Character.getNumericValue(charsCoord[1]) < 4) {
                break;
            }
        }
        return charsCoord;
    }
}

