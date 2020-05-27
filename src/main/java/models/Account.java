package models;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private String id;
    private double balance;
    private String type;
    private List<Customer> customers = new ArrayList<>();
    private List<Transaction> transactions = new ArrayList<>();

    public Account() {
    }

    public Account(String id, double balance, String type, List<Customer> customers, List<Transaction> transactions) {
        this.id = id;
        this.balance = balance;
        this.type = type;
        this.customers = customers;
        this.transactions = transactions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "models.Account{" +
                "id='" + id + '\'' +
                ", balance=" + balance +
                ", type='" + type + '\'' +
                ", customers=" + customers +
                ", transactions=" + transactions +
                '}';
    }
}
