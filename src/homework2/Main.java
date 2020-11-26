package homework2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        min_maxNumber();
    }

    private static void invertArray() {
        int[] massive = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(massive));
        for(int i = 0; i < massive.length; i++){
            if(massive[i] == 1){
                massive[i] = 0;
            }else {
                massive[i] = 1;
            }
        }
        System.out.println(Arrays.toString(massive));
    }

    private static void fillArray() {
        final int SIZE_MASSIVE = 8;
        final int NAME_LAST_NUMBER = 21;
        int[] massive = new int[SIZE_MASSIVE];
        int count = 0;
        for(int i = 0; i <= NAME_LAST_NUMBER; i = i + 3){
            massive[count] = i;
            count++;
        }
        System.out.println(Arrays.toString(massive));
    }

    private static void changeArray() {
        int[] massive = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(massive));
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] < 6) {
                massive[i] = massive[i] * 2;
            }
        }
        System.out.println(Arrays.toString(massive));
    }

    private static void fillDiagonal() {
        int[][] arr = new int[4][4];
        printArray(arr);
        for (int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++){
                if(i == j){
                    arr[i][j] = 1;
                }
            }
        }
        System.out.println();
        printArray(arr);
    }

    private static void printArray(int[][] deepArray){
        for (int[] ints : deepArray) {
            for (int anInt : ints) {
                System.out.printf("%2d ", anInt);
            }
            System.out.println();
        }
    }

    private static void min_maxNumber(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 21, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        int min = arr[0], max = arr[0];
        for (int ints : arr) {
            if(ints < min ) {
                min = ints;
            }
            if(ints > max){
                max = ints;
            }
        }
        System.out.printf("Минимальное число -%2d, максимальное число - %2d", min, max);
    }
}
