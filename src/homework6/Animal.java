package homework6;

public abstract class Animal {
    private String name;
    private static int countAnimals = 0;
    protected int limit_run, limit_swim;

    public Animal(String name) {
        this.name = name;
        countAnimals++;
    }

    public Animal(String name, int limit_run, int limit_swim){
        this(name);
        this.limit_run = limit_run;
        this.limit_swim = limit_swim;
    }


    private boolean checkRun(double obstacleLength, int limitLength) {
        if (obstacleLength > limitLength) {
            System.out.printf("Достигнут предел бега %s%n", name);
            return false;
        } else if (obstacleLength < 0) {
            System.out.println("Введите корректные значения");
            return false;
        }
        return true;
    }

    public void run(double obstacleLength) {
        if (checkRun(obstacleLength, limit_run)) {
            System.out.println(name + " пробежал " + obstacleLength + " м");
        }
    }

    public void run(int obstacleLength) {
        if (checkRun(obstacleLength, limit_run)) {
            System.out.println(name + " пробежал " + obstacleLength + " м");
        }
    }

    public void run() {
        System.out.println(name + " бежит");
    }

    private boolean checkSwim(double obstacleLength, int limitLength) {
        if(obstacleLength > limitLength) {
            System.out.printf("Достигнут предел плавания %s%n", name);
            return false;
        } else if (obstacleLength < 0) {
            System.out.println("Введите корректные значения");
            return false;
        }
        return true;
    }

    public void swim(double obstacleLength) {
        if (checkSwim(obstacleLength, limit_swim)) {
            System.out.println(name + " проплыл " + obstacleLength + " м");
        }
    }

    public void swim(int obstacleLength) {
        if (checkSwim(obstacleLength, limit_swim)) {
            System.out.println(name + " проплыл " + obstacleLength + " м");
        }
    }

    public void swim() {
        System.out.println(name + " плывёт");
    }

    public static int getCountAnimals() {
        return countAnimals;
    }
}
