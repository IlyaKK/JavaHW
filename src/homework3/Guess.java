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

    private static void start_game() {
        int answer = (int) (Math.random() * 10);
        final int NUMBER_OF_ATTEMPT = 3;
        int attempt = 0;
        while (true) {
            System.out.printf("Угадайте число от 0 до 9. Число оставшихся попыток %d%n", NUMBER_OF_ATTEMPT - attempt);
            int userAnswer = scanner.hasNextInt() ? scanner.nextInt() : 12;
            if (userAnswer == answer) {
                System.out.println("Поздравляю! Вы победили!");
                checkEnd();
                break;
            }else if (userAnswer > answer) {
                System.out.println("Вы ввели слишком большое число");
            } else if (userAnswer < answer) {
                System.out.println("Вы ввели слишком маленькое число");
            }

            if(attempt == NUMBER_OF_ATTEMPT - 1){
                System.out.printf("Превышено количество попыток. Вы проиграли. Правильный ответ %d.%n",answer);
                checkEnd();
                break;
            }
            attempt++;
        }
    }
}
