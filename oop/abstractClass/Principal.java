package oop.abstractClass;

public class Principal {
    static public void main(String[] args) {
      Product p = new PerishableProduct();
      p.description = "Caixa de Leite";

      PerishableProduct pp = (PerishableProduct) p;
      pp.expirationDate = "10/10/2020";

      pp.printDescription();
    }
}
