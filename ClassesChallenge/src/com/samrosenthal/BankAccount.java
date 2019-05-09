package com.samrosenthal;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private int phone;

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhone(int phone){
        this.phone = phone;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public int getPhone(){
        return this.phone;
    }

    public void depositFunds(double funds){
        this.balance += funds;
        System.out.println("Your current balance after depositing " + funds + " is " + this.balance + ".");
    }

    public void withdrawFunds(double funds){
        if ((this.balance - funds) >= 0) {
            this.balance -= funds;
            System.out.println("Your current balance after withdrawing " + funds + " is " + this.balance + ".");
        } else {
            System.out.println("Insufficient funds for your withdrawal of " + funds + ".");
        }
    }
}
