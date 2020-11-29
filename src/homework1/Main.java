package homework1;

public class Main {
    public static void main(String[] args) {

        int a = 1;
        System.out.println(a);

        byte b = 125;
        System.out.println(b);

        short c = 10000;
        System.out.println(c);

        long d = 100000L;
        System.out.println(d);

        float e = 5.6f;
        System.out.println(e);

        double f = 7.2;
        System.out.println(f);

        char g = 'K';
        System.out.println(g);

        boolean h = true;
        System.out.println(h);

        String name = "Jake";

        double n1 = 2;
        double n2 = 10;
        double n3 = 2;
        double n4 = 0;

        System.out.println(calculate(n1, n2, n3, n4));
        System.out.println(checkSum(n1, n2));
        checkNumber(5);
        checkNumber(-6);
        System.out.println(checkNegative(-6));
        System.out.println(checkNegative(5));
        greeting(name);
        checkYear(2400);
    }

    private static double calculate(double a, double b, double c, double d) {
        if (d == 0) {
            System.out.println("Делить на ноль нельзя. Четвёртый параметр должен быть ненулевым");
            return 0;
        }
        return a * (b + (c / d));
    }

    private static boolean checkSum(double a, double b) {
        return a + b > 10 && a + b <= 20;
    }

    private static void checkNumber(int number) {
        String word = (number >= 0) ? "положительное" : "отрицательное";
        System.out.printf("Число %d - %s%n", number, word);
    }

    private static boolean checkNegative(int a) {
        return a < 0;
    }

    private static void greeting(String name) {
        System.out.println("Привет, " + name + "!");
    }

    private static void checkYear(int year) {
        String property = "невисокосный";
        if (year % 400 == 0 || (year % 4 == 0 & year % 100 != 0)) {
            property = "високосный";

        }
        System.out.printf("Год %d - %s%n", year, property);
    }
}