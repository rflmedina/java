package oop.heritage;

public class Person {
    // protected = can be accessed by the classes that inherit from this class
    protected String name; 
    protected int age;

    protected void sayHello() {
       System.out.println("Hello, my name is " + name + " and I'm " + age + " years old.");
    }
}
