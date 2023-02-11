package oop.javaBean;

public class Principal {
    public static void main(String[] args) {
        PersonBean person = new PersonBean();
        person.setName("John");
        person.setAge(30);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
