package com.example.bank_account.view;

import com.example.bank_account.model.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter account holder: ");
        String name = scanner.nextLine();

        System.out.print("Enter initial deposit(0 for none): ");
        double deposit = scanner.nextDouble();

        Account account = new Account(id, name, deposit);

        scanner.nextLine();

        System.out.println("\nACCOUNT DATA:");
        System.out.println(account);

        System.out.print("\nEnter a deposit value: ");
        deposit = scanner.nextDouble();
        account.Deposit(deposit);

        scanner.nextLine();

        System.out.println("\nUPDATED ACCOUNT DATA:");
        System.out.println(account);

        System.out.print("\nEnter a withdraw value(tax of R$5.00 per withdraw): ");
        double withdraw = scanner.nextDouble();
        account.Withdraw(withdraw);

        scanner.nextLine();

        System.out.println("\nUPDATED ACCOUNT DATA:");
        System.out.println(account);

        scanner.close();
    }
}
