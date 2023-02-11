package oop.thisExample;

public class Principal {
    static public void main(String[] args) {
        Car car = new Car();
        car.model = "Fiat";

        System.out.println("Modelo antes:" + car.model);

        car.changeModel("Ferrari"); 

        System.out.println("Modelo depois" + car.model);
    }
}
