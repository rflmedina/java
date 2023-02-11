package oop.interfaceEx;

public class Purchase implements Authorizable, Printable { 
    private double totalValue;
    private String product;
    private String clientName;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    @Override
    public String getPageHeader() {
        return this.getProduct() + " - " + this.getClientName();
    }

    @Override
    public String getPageFooter() {
        return this.getClientName();
    }

    @Override
    public double getTotalValue() {
        return this.totalValue;
    }
}
