package exercises.walkWithYourDog;

public class Ride {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Alice";

        Dog dog = new Dog();
        dog.name = "Rex";
        person.dog = dog;

        Walk c = new Walk();
        c.walking(person);
    }
}
