package homework7;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(33);
        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Кузя", 15);
        cats[1] = new Cat("Матроскин", 10);
        cats[2] = new Cat("Борис", 5);
        cats[3] = new Cat("Маркиз", 6);

        for(Cat cat : cats){
            cat.eat(plate);
            plate.info();
            if(cat.isSatiety()) System.out.println("Кот " + cat.getName() + " наелся");
        }
        plate.addFood(3);
        plate.info();
        cats[3].eat(plate);
        if(cats[3].isSatiety()) System.out.println("Кот " + cats[3].getName() + " наелся");
    }
}
