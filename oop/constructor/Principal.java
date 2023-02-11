package oop.constructor;

public class Principal {
    static public void main(String[] args) {
        Person person = new Person("Rafaela", 20);
        System.out.println("Nome: " + person.name);
        System.out.println("Idade: " + person.age);

        Person person2 = new Person("Marcos");
        System.out.println("Nome: " + person2.name);
        System.out.println("Idade: " + person.age);
    }
}
