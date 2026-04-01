package com.example.bank_account.model;

public class Account {
    //Attributes
    private int id;
    private String name;
    private double balance;

    //Constructor
    public Account(int id, String name, double deposit) {
        this.id = id;
        this.name = name;
        this.balance = deposit;
    }

    //Getters and Setters
    public void setName(String name) {this.name = name;}

    public int getId() {return id;}
    public String getName() {return name;}
    public double getBalance() {return balance;}

    //Methods
    public void Deposit(double amount){
        balance += amount;

        System.out.printf("Deposit of R$%.2f confirmed.\n", amount);
        System.out.printf("Total amount in account: R$%.2f\n", balance);
    }

    public void Withdraw(double amount){
        balance -= amount + 5;

        System.out.printf("Withdraw of R$%.2f confirmed.\n", amount);
        System.out.printf("Total amount in account: R$%.2f\n", balance);
    }

    @Override
    public String toString() {
        return "Account ID: " + id +
                "\nHolder Name: " + name +
                "\nBalance: R$" + String.format("%.2f", balance);
    }
}
