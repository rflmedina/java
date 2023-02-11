package oop.encaps;

public class Principal {
    public static void main(String[] args) {
        machine airMachine = new machine();

        airMachine.changeTemperature(0);

        System.out.println("Temperatura: " + airMachine.getTemperature() + "ºC");
    }
}
