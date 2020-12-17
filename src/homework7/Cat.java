package homework7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate p){
        int foodInPlate = p.decreaseFood(appetite);
        if(foodInPlate >= 0){
            satiety = true;
        }else{
            System.out.println(name + " не наелся. Не хватило тарелок(ки) " + -foodInPlate + " еды");
        }
    }

    public boolean isSatiety() {
        return satiety;
    }


    public String getName() {
        return name;
    }
}
