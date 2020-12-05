package homework3;

import java.util.Scanner;

public class Guess {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        start_game();
    }

    private static void checkEnd(){
        System.out.println("Повторить игру?(1 – да / 0 – нет)");
        int userAnswer = scanner.hasNextInt() ? scanner.nextInt() : 2;
        switch (userAnswer){
            case 0:
                break;
            case 1:
                start_game();
                break;
            default:
                System.out.println("Повторите выбор ещё раз");
                checkEnd();
        }
    }

    private static void checkAnswer(int ans){
        int userAnswer = scanner.hasNextInt() ? scanner.nextInt() : 12;
        if (userAnswer == ans) {
             System.out.println("Поздравляю! Вы победили!");
             checkEnd();
             break;
         } else if (userAnswer == 12) {
            System.out.println("Вы ввели недопустимые символы, попробуйте ввести число ещё раз");
            checkAnswer(ans);
         } else if (userAnswer > ans) {
             System.out.println("Вы ввели слишком большое число");
         } else if (userAnswer < ans) {
             System.out.println("Вы ввели слишком маленькое число");
         }
    }

    private static void start_game() {
        int answer = (int) (Math.random() * 10);
        final int NUMBER_OF_ATTEMPT = 3;
        int attempt = 0;
        while (true) {
            System.out.printf("Угадайте число от 0 до 9. Число оставшихся попыток %d%n", NUMBER_OF_ATTEMPT - attempt);
            checkAnswer(answer);

            if(attempt == NUMBER_OF_ATTEMPT - 1){
                System.out.printf("Превышено количество попыток. Вы проиграли. Правильный ответ %d.%n",answer);
                checkEnd();
                break;
            }
            attempt++;
        }
    }
}
