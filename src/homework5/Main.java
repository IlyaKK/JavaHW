package homework5;

public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312",
                30_000L, 30);
        persArray[1] = new Person("Ekaterina II", "Quin", "equiny@mailbox.com", "892328312",
                500_000L, 41);
        persArray[2] = new Person("Keanu Reeves", "Actor", "johnick@mailbox.com", "892312472",
                400_000L, 56);
        persArray[3] = new Person("Bill Gates", "Programmer", "bgate@microsoft.com", "892312426",
                119_000_000_000L, 56);
        persArray[4] = new Person("Philip Pullman", "Writer", "phpul@london.com", "88953124261",
                300_000_000L, 74);

        for(Person pers : persArray){
            if(pers.getAge() > 40) {
                pers.printInfo();
                System.out.println();
            }
        }
    }
}
