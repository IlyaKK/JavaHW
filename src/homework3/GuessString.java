package homework3;

import java.util.Arrays;
import java.util.Scanner;

public class GuessString {
    public static Scanner scanner = new Scanner(System.in);
    private static final String[] WORDS = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
            "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    private static final int NUMBER_FAKE_SYMBOLS = 15;

    public static void main(String[] args) {
        start_game();
    }

    private static void start_game() {
        int numberRundomWord = (int) (Math.random() * WORDS.length);
        String rundomWord = WORDS[numberRundomWord];
        System.out.println("Угадайте слово из представленных ниже");
        System.out.println(Arrays.toString(WORDS));
        String userWord = "";
        char sharp = '#';
        while (true){
            System.out.printf("%nВведите слово%n");
            userWord = scanner.nextLine();
            if(userWord.equals(rundomWord)){
                System.out.println("Поздравляю, вы угадали");
                System.exit(0);
            }
            System.out.println("Вы не угадали, посмотрите на подсказку ниже");
            for(int i = 0; i < NUMBER_FAKE_SYMBOLS; i++){
                if(i < rundomWord.length() && i < userWord.length() && userWord.charAt(i) == rundomWord.charAt(i)){
                    System.out.print(userWord.charAt(i));
                }else {
                    System.out.print(sharp);
                }
            }
        }
    }

}
