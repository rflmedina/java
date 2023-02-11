package oop.interfaceEx;

public class Checkout {
    private Operator operator;
    private Printer printer;

    public Checkout(Operator operator, Printer printer) {
        this.operator = operator;
        this.printer = printer;
    }

    public void finishPurchase(Purchase purchase, Cart cart) {
        boolean authorized = this.operator.autorizathion(purchase, cart);

        if(authorized) {
            this.printer.print(purchase);
        } else {
            System.out.println("Purchase not authorized");
        }
    }
}
