package oop.abstractClass;

public abstract class Product { // abstract: the class can't be instantiated
    String description;

    public String getDescription() {
        return description;
    }

    public abstract void printDescription(); // abstract: the method must be implemented in the subclasses
    
}
