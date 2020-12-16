package homework6;

public class Dog extends Animal {
    private final int LIMIT_RUN = 500;
    private final int LIMIT_SWIM = 10;
    private static int countDog = 0;

    public Dog(String name) {
        super(name);
        super.limit_run = LIMIT_RUN;
        super.limit_swim = LIMIT_SWIM;
        countDog++;
    }

    public Dog(String name, int limit_run, int limit_swim){
        super(name, limit_run, limit_swim);
        countDog++;
    }

    public static int getCountDog() {
        return countDog;
    }
}
