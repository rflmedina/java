package oop.overload;

public class RegisterPerson {
    public void register(Person person) {
        storePerson(person.getName(), person.getAge());
    }

    public void register(String name, int age) {
        storePerson(name, age);
    }


    private void storePerson(String name, int age) {
        System.out.println("Saving " + name + " with " + age + " years old.");
    }
}
