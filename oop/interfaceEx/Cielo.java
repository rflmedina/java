package oop.interfaceEx;

public class Cielo implements Operator {

    @Override
    public boolean autorizathion(Authorizable authorizable, Cart cart) {
        return cart.getCartNumber().startsWith("2345")
            && authorizable.getTotalValue() < 5000.00;
    }    
}

