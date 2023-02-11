package oop.overload;

public class Principal {
    public static void main(String[] args) {
        RegisterPerson registration = new RegisterPerson();
        Person user = new Person("John", 20);
        registration.register(user);

        Person user2 = new Person("Agatha", 23);
        registration.register(user2);

    }
}
