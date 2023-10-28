package dev.lpa;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customerList;

    public Bank(String name) {
        this.name = name;
        this.customerList = new ArrayList<Customer>();
    }

    public void addCustomer (Customer customer){
        if(checkCustomer(customer.getName()) == null){
            customerList.add(customer);
        } else {
            System.out.println("Existing customer: " + customer.getName());
        }
    }

    public Customer checkCustomer (String customerName){
        for (Customer customer: customerList){
            if (customer.getName().contains(customerName)){
                return customer;
            }
        }
        return null;
    }

    public void addTransaction (String customerName, double transactionAmount){
        // Check whether the person is a customer of the specific bank
        Customer customer = checkCustomer(customerName);
        if (customer != null){
            customer.getTransactions().add(transactionAmount);
            customer.setBalance(transactionAmount);
        } else {
            System.out.println("Customer not found!");
        }
    }

    public void printStatement (String customerName){
        Customer customer = checkCustomer(customerName);
        if (customer !=null){
            ArrayList<Double> list = customer.getTransactions();
            System.out.println("-".repeat(15));
            System.out.println("Customer: " + customerName);
            System.out.println("Balance: " + customer.getBalance());
            System.out.printf("%-10s %-10s\n", "Index", "Amount");
            System.out.println("-".repeat(15));
            int i = 1;
            for (Double element : list){
                System.out.printf("%-10d %-10f\n", i, element);
                i++;
            }
            System.out.println("-".repeat(15));
        } else {
            System.out.println("Customer not found!");
        }
    }
}
