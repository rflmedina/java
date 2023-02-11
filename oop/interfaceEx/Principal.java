package oop.interfaceEx;

public class Principal {
    static public void main(String[] args) {
        Operator operator = new Cielo();
        Printer printer = new HP();

        Cart cart = new Cart();
        cart.setName("John Doe");
        cart.setCartNumber("2345-6489-1234-5678");

        Purchase purchase = new Purchase();
        purchase.setClientName("John Doe");
        purchase.setProduct("Notebook");
        purchase.setTotalValue(3500.00);

        Checkout checkout = new Checkout(operator, printer);
        checkout.finishPurchase(purchase, cart);
    }
}
