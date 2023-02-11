package oop.overlap;

import java.util.Date;

public class PerishableProduct extends Product {
    protected Date expirationDate;

    public void idetenfify() {
        super.idetenfify(); // Call the superclass method
        System.out.println("Expiration date: " + expirationDate);
    }
}
