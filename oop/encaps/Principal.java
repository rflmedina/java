package oop.encaps;

public class Principal {
    public static void main(String[] args) {
        machine airMachine = new machine();

        airMachine.temperature = 21;

        System.out.println("Temperatura: " + airMachine.temperature + "ºC");
    }
}
