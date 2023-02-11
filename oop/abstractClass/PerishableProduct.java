package oop.abstractClass;

public class PerishableProduct extends Product {
    String expirationDate;

    public void printDescription() {
        System.out.println("Descrição: " + super.getDescription());
        System.out.println("Vence em: " + expirationDate);
    }
}
