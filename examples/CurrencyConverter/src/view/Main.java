package view;

import model.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main{
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dollar price: ");
        double dollarPrice = scanner.nextDouble();

        System.out.print("How many dollars will be bought: ");
        double dollars = scanner.nextDouble();

        System.out.println("Amount to be paid in reais: " + String.format("%.2f", CurrencyConverter.amountConverted(dollarPrice, dollars)));
    }
}