package oop.enums;

public enum Naipe {
    // Enum serve para criar um conjunto de constantes
    OURO("red"), 
    PAUS("black"), 
    ESPADAS("black"), 
    COPA("red");

    private String color;

    Naipe(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
