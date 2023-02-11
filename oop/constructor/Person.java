package oop.constructor;

public class Person {
    String name;
    int age; 

    Person(String name) { // Não tem tipo de retorno | mesmo nome da classe
       this.name = name;
    }

    Person(String name, int age) {
        this(name); // referencia o construtor acima
        this.age = age;
    }  
}
