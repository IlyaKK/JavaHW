package homework6;

public class Main {
    public static void main(String[] args) {
        Animal dogBobik = new Dog("Бобик");
        Animal dogMarkiz = new Dog("Маркиз");
        Animal catBarsik = new Cat("Барсик");
        Animal catMurzik = new Cat("Мурзик");

        Animal dogBobik1 = new Dog("Бобик", 400, 5);
        Animal dogMarkiz1 = new Dog("Маркиз", 600, 15);
        Animal catBarsik1 = new Cat("Барсик", 300, 5);
        Animal catMurzik1 = new Cat("Мурзик", 100, 10);


        Animal[] animals = {dogBobik, dogBobik1, dogMarkiz, dogMarkiz1, catBarsik, catBarsik1, catMurzik, catMurzik1};

        for (Animal animal : animals) {
            animal.run(500);
            animal.swim(10);
            animal.run();
            animal.swim();
        }

        System.out.printf("%nКоличество котов: %d%nКоличество псов: %d%nКоличество животных: %d%n", Cat.getCountCat(), Dog.getCountDog(), Animal.getCountAnimals());
    }
}
