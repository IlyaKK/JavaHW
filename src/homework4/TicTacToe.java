package homework4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static final int SIZE = 5;
    static final int WINNING_SERIES = 4;

    static final char DOT_EMPTY = '•';
    static final char DOT_HUMAN = 'X';
    static final char DOT_AI = 'O';

    static final String HEADER_FIRST_EMPTY = "♥";
    static final String EMPTY = " ";

    static char[][] map = new char[SIZE][SIZE];
    static final Scanner in = new Scanner(System.in);
    static final Random random = new Random();


    public static void main(String[] args) {
        turnGame();
    }

    private static void turnGame() {
        initMap();

        printMap();

        playGame();
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printMapHeader();

        printMapRow();
    }

    private static void printMapHeader() {
        System.out.println();
        System.out.print(HEADER_FIRST_EMPTY + EMPTY);
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + EMPTY);
    }

    private static void printMapRow() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + EMPTY);
            }
            System.out.println();
        }
    }


    private static void playGame() {

        while (true) {
            humanTurn();
            printMap();
            checkEnd(DOT_HUMAN);

            aiTurn();
            printMap();
            checkEnd(DOT_AI);

        }
    }

    private static void humanTurn() {
        int rowNumber = 0;
        int columnNumber = 0;

        System.out.println("\nХод человека! Введите номера строки и столбца!");

        do {
            System.out.print("Строка = ");
            if (in.hasNextInt()) {
                rowNumber = in.nextInt();
            } else {
                in.next();
                System.out.println("Введите число в диапазоне от 1 до " + SIZE + "\n");
                continue;
            }

            System.out.print("Столбик = ");
            if (in.hasNextInt()) {
                columnNumber = in.nextInt();
            } else {
                in.next();
                System.out.println("Введите число в диапазоне от 1 до " + SIZE + "\n");
                continue;
            }

        } while (!isCellValid(rowNumber, columnNumber));

        map[rowNumber - 1][columnNumber - 1] = DOT_HUMAN;
    }

    private static boolean isCellValid(int rowNumber, int columnNumber) {
        return isCellValid(rowNumber, columnNumber, false);
    }

    private static boolean isCellValid(int rowNumber, int columnNumber, boolean isAI) {

        if (!isAI && (rowNumber < 1 || rowNumber > SIZE || columnNumber < 1 || columnNumber > SIZE)) {
            System.out.println("\nПроверьте значение строки и столбца");
            return false;
        }
        // occupancy

        if (map[rowNumber - 1][columnNumber - 1] != DOT_EMPTY) {
            if (!isAI) {
                System.out.println("\nВы выбрали занятую ячейку");
            }
            return false;
        }

        return true;
    }

    private static void checkEnd(char symbol) {
        boolean isEnd = false;

        if (checkWin(symbol)) {
            String winMessage;

            if (symbol == DOT_HUMAN) {
                winMessage = "Ура! Мы победили!";
            }
            else {
                winMessage = "Восстание близко. AI победил.";
            }

            isEnd = true;
            System.out.println(winMessage);
        }

        if(!isEnd && isMapFull()){
            System.out.println("Ничья!");
            isEnd = true;
        }

        if (isEnd) {
            System.exit(0);
        }

    }

    private static boolean checkWin(char symbol) {
        int rowCorrectAnswer;
        int columnCorrectAnswer;
        int diagonalLRCorrectAnswer = 0;
        int diagonalRLCorrectAnswer = 0;
        int sideUpDiagonalCorrectAnswer = 0;
        int sideDownDiagonalCorrectAnswer = 0;

        for(int i = 0; i < SIZE; i++){
            rowCorrectAnswer = 0;
            columnCorrectAnswer = 0;
            for(int j = 0; j < SIZE; j++){
                if(map[i][j] == symbol){
                    rowCorrectAnswer++;
                }else if(j > 0 && map[i][j - 1] == symbol && map[i][j] != symbol){
                    rowCorrectAnswer--;
                }

                if(map[j][i] == symbol){
                    columnCorrectAnswer++;
                }else if(i > 0 && map[j][i - 1] == symbol && map[j][i] != symbol){
                    columnCorrectAnswer--;
                }

                if(i == j && map[i][j] == symbol){
                    diagonalLRCorrectAnswer++;
                }else if(i > 0 && j > 0 && i == j && map[i-1][j-1] == symbol && map[i][j] != symbol){
                    diagonalLRCorrectAnswer--;
                }

                if(i + j == SIZE - 1 && map[i][j] == symbol){
                    diagonalRLCorrectAnswer++;
                }else if(i > 0 && j > 0 && i + j == SIZE - 1 && map[i-1][j-1] == symbol && map[i][j] != symbol){
                    diagonalRLCorrectAnswer--;
                }

            }
            if(rowCorrectAnswer >= WINNING_SERIES || columnCorrectAnswer >= WINNING_SERIES || diagonalLRCorrectAnswer >= WINNING_SERIES || diagonalRLCorrectAnswer >= WINNING_SERIES)return true;
        }

        int countSideDiagonal = SIZE-WINNING_SERIES;
        for(int j = 1; j < countSideDiagonal+1;j++) {
            sideUpDiagonalCorrectAnswer = 0;
            sideDownDiagonalCorrectAnswer = 0;
            for (int i = 0; i < SIZE-j; i++) {
                if (map[i][i+j] == symbol) {
                    sideUpDiagonalCorrectAnswer++;
                } else if (i > 0 && map[i-1][i+j-1] == symbol && map[i][i+j] != symbol) {
                    sideUpDiagonalCorrectAnswer--;
                }

                if (map[i+j][i] == symbol) {
                    sideDownDiagonalCorrectAnswer++;
                } else if (i > 0 && map[i+j-1][i-1] == symbol && map[i+j][i] != symbol) {
                    sideDownDiagonalCorrectAnswer--;
                }
            }
            if(sideUpDiagonalCorrectAnswer >= WINNING_SERIES || sideDownDiagonalCorrectAnswer >= WINNING_SERIES)return true;
        }

        for(int j = 1; j < countSideDiagonal+1;j++) {
            sideUpDiagonalCorrectAnswer = 0;
            sideDownDiagonalCorrectAnswer = 0;
            for (int i = 0; i < SIZE-j; i++) {
                if (map[i+j-1][SIZE-2-i] == symbol) {
                    sideUpDiagonalCorrectAnswer++;
                } else if (i > 0 && map[i+j-2][SIZE-i-1] == symbol && map[i+j-1][SIZE-2-i] != symbol) {
                    sideUpDiagonalCorrectAnswer--;
                }

                if (map[i+j][SIZE-i-1] == symbol) {
                    sideDownDiagonalCorrectAnswer++;
                } else if (i > 0 && map[i+j-1][SIZE-i] == symbol && map[i+j][SIZE-i-1] != symbol) {
                    sideDownDiagonalCorrectAnswer--;
                }
            }
            if(sideUpDiagonalCorrectAnswer >= WINNING_SERIES || sideDownDiagonalCorrectAnswer >= WINNING_SERIES)return true;
        }

        return  false;
    }

    private static boolean isMapFull() {
        for (char[] chars : map) {
            for (char symbol : chars) {
                if (symbol == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }


    private static void aiTurn() {
        int rowNumber;
        int columnNumber;
        System.out.println("\nХод компютера\n");
        do {
            rowNumber = random.nextInt(SIZE) + 1;
            columnNumber = random.nextInt(SIZE) + 1;
        } while (!isCellValid(rowNumber, columnNumber, true));

        map[rowNumber - 1][columnNumber - 1] = DOT_AI;
    }

}

