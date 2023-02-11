package oop.heritage;

public class Principal {
    public static void main(String[] args)  {
        player p1 = new player();
        p1.name = "Ronaldo";
        p1.age = 32;

        coach c1 = new coach();
        c1.name = "Zidane";
        c1.age = 45;

        p1.sayHello();
        c1.sayHello();
    }
}
