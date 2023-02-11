package oop.overlap;

public class Principal {
    public static void main(String[] args) {
        PerishableProduct bean = new PerishableProduct();
        bean.description = "Beans";
        bean.expirationDate = new java.util.Date();
        bean.idetenfify();
    }
}
