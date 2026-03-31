package model;

public class CurrencyConverter {
    public static final double IOF = 0.06;
    private double dollarPrice;
    private double dollars;

    public CurrencyConverter(double dollarPrice, double dollars) {
        this.dollarPrice = dollarPrice;
        this.dollars = dollars;
    }

    public void setDollarPrice(double dollarPrice) {this.dollarPrice = dollarPrice;}
    public void setDollars(double dollars) {this.dollars = dollars;}

    public double getDollarPrice() {return dollarPrice;}
    public double getDollars() {return dollars;}

    public static double amountConverted(double dollarPrice, double dollars) {
        return dollarPrice * dollars * (1.0 + IOF);
    }
}