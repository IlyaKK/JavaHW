package homework6;

public class Cat extends Animal {
    private final int LIMIT_RUN = 200;
    private String name;
    private static int countCat = 0;


    public Cat(String name) {
        super(name);
        this.name = name;
        super.limit_run = LIMIT_RUN;
        countCat++;
    }

    public Cat(String name, int limit_run, int limit_swim){
        super(name, limit_run, limit_swim);
        this.name = name;
        countCat++;
    }

    private void message() {
        System.out.println(name + " не умеет плавать");
    }

    @Override
    public void swim() {
        message();
    }

    @Override
    public void swim(int obstacleLength) {
        message();
    }

    @Override
    public void swim(double obstacleLength) {
        message();
    }

    public static int getCountCat() {
        return countCat;
    }
}
