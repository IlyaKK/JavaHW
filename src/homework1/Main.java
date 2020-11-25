package homework1;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        byte b = 125;
        short c = 10000;
        long d = 100000L;
        float e = 5.6f;
        double f = 7.2;
        char g = 'K';
        boolean h = true;
        String name = "Jake";
        double n1 = 10;
        double n2 = 10;
        double n3 = 2;
        double n4 = 2;
        System.out.println(calculate(n1, n2, n3, n4));
        System.out.println(checkSum(n1, n2));
        System.out.println(checkNumber(5));
        System.out.println(checkNumber(-6));
        System.out.println(checkNegative(-6));
        System.out.println(checkNegative(5));
        greeting(name);
        checkYear(2104);
    }

    private static double calculate(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    private static boolean checkSum(double a, double b){
        boolean checkSum;
        double sum = a + b;
        checkSum = sum > 10 && sum <= 20;
        return checkSum;
    }

    private static String checkNumber(int a){
        String checkString;
        if(a >= 0){
            checkString = "Положительное";
        }
        else {
            checkString = "Отрицательное";
        }
        return checkString;
    }

    private static boolean checkNegative(int a){
        return a < 0;
    }

    private static void greeting(String name){
        System.out.println("Привет, " + name + "!");
    }

    private static void checkYear(int year){
        String property = "";
        if(year % 4 == 0){
            property = "Високосный";
            if(year % 100 == 0){
                property = "Невисокосный";
                if(year % 400 == 0){
                    property = "Високосный";
                }
            }
        }
        System.out.println(property);
    }
}