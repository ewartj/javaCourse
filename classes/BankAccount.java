package com.company;

public class BankAccount {
    private float balance;
    private int accountNumber;
    private String customerName;
    private String customerEmail;
    private int phoneNumber;

    public BankAccount() {
        this (0000, 0, "n/a", "n/a", 0000);
        System.out.println("Empty constructor");
    }
    public BankAccount(int accountNumber, float balance,
                       String customerName, String customerEmail,
                       int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;

    }

    public BankAccount(int accountNumber, String customerName, String customerEmail, int phoneNumber) {
        this(0001, 100, customerName, customerEmail, phoneNumber);
    }

    public float deposit(float cash)
    {
        this.balance += cash;
        System.out.println("Account has " + this.balance);
        return this.balance;
    }
    public float withdrawal(float cash)
    {
        if (this.balance - cash < 0){
            System.out.println("Insuffient funds balance is " + this.balance);
            return -1;
        }
        else {
            this.balance -= cash;
            System.out.println("Withdrawal of " + cash + " balance is " + this.balance);
            return this.balance;
        }
    }
// The belog setters and getters aren't necesary (the values are in the constructor)
//    public float getBalance() {
//        return balance;
//    }
//
//    public void setBalance(float balance) {
//        this.balance = balance;
//    }
//
//    public int getAccountNumber() {
//        return accountNumber;
//    }
//
//    public void setAccountNumber(int accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    public String getCustomerName() {
//        return customerName;
//    }
//
//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }
//
//    public String getCustomerEmail() {
//        return customerEmail;
//    }
//
//    public void setCustomerEmail(String customerEmail) {
//        this.customerEmail = customerEmail;
//    }
//
//    public int getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(int phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
}
