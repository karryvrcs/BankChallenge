package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;
    private double balance;

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        this.balance = 0.00;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions(){
        return transactions;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(Double amount) {
        this.balance = balance + amount;
    }
}
