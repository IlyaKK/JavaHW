package homework6;

public class Main {
    public static void main(String[] args) {
        Animal dogBobik = new Dog("Бобик");
        Animal dogMarkiz = new Dog("Маркиз");
        Animal catBarsik = new Cat("Барсик");
        Animal catMurzik = new Cat("Мурзик");

        dogBobik.run(40.5);
        dogMarkiz.run(600);
        dogMarkiz.run();
        dogBobik.swim(6);
        dogMarkiz.swim(15);
        dogMarkiz.swim();

        catBarsik.run(160);
        catBarsik.run(500);
        catMurzik.run();
        catBarsik.swim(6);
        catBarsik.swim(15);
        catMurzik.swim();

        System.out.printf("%nКоличество котов: %d%nКоличество псов: %d%nКоличество животных: %d%n", Cat.getCountCat(), Dog.getCountDog(), Animal.getCountAnimals());
    }
}
