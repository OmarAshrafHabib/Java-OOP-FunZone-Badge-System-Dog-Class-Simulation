/**
 * @author Omar Habib ID:3742418
 */

public class DogTestDriver {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Max", 3);
        Dog dog2 = new Dog("Lucy", 1);
        Dog dog3 = new Dog("Bella", 5);

        dog3.setName("Luna");
        dog2.bday();

        System.out.println("Name: " + dog1.getName());
        System.out.println("Age: " + dog1.getAge());
        System.out.println("Person Years: " + dog1.personYears());
        System.out.println();

        System.out.println("Name: " + dog2.getName());
        System.out.println("Age: " + dog2.getAge());
        System.out.println("Person Years: " + dog2.personYears());
        System.out.println();

        System.out.println("Name: " + dog3.getName());
        System.out.println("Age: " + dog3.getAge());
        System.out.println("Person Years: " + dog3.personYears());

    }
}
