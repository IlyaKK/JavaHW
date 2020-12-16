package homework5;

public class Person {
    private String name;
    private String post;
    private String mail;
    private String phoneNumber;
    private long salary;
    private int age;

    public Person(String name, String post, String mail, String phoneNumber, long salary, int age) {
        this.name = name;
        this.post = post;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String toString() {
        return "Сотрудник: " + name + '\n' +
                " Должность: " + post + '\n' +
                " email: " + mail + '\n' +
                " Телефон: " + phoneNumber + '\n' +
                " Зарплата: " + salary + '\n' +
                " Возраст: " + age;
    }

    public void printInfo() {
        System.out.println(this);
    }

    public long getAge() {
        return age;
    }
}
