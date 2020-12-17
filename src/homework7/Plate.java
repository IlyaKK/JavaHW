package homework7;

public class Plate {
    private int food;
    public Plate(int food){
        this.food = food;
    }

    public int decreaseFood(int n){
        if(food < n){
            return food-n;
        }else {
            food -= n;
        }
        return food;
    }

    public void info(){
        System.out.println("plate = " + food);
    }

    public void addFood(int n){
        food += n;
        System.out.printf("Добавили в тарелку %d еды%n", n);
    }
}
