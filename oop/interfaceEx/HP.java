package oop.interfaceEx;

public class HP implements Printer {

    @Override
    public void print(Printable printable) {
        System.out.println("HP: " + printable.getPageHeader());
        System.out.println("HP: " + printable.getPageFooter());
    }

}
