package oop.enums;

public class Cart {
    private int number;
    private Naipe naipe;

    Cart(int number, Naipe naipe) {
        this.number = number;
        this.naipe = naipe;
    }

    public void show() {
        System.out.println("Carta: " + this.number + " de " + this.naipe + " (" + this.naipe.getColor() + ")");
    }
}
