package org.example;

public class Account {

    //vars
    private String id;
    private String name;
    private int balance = 0;


    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit(int amount){
        if (amount<=0){
            System.out.print("amount is not enough");
        }else{
            this.balance+=amount;
        }
        System.out.print("your balance: ");
        return balance;
    }

    public int debit(int amount){
        if (balance<=0){
            System.out.print("balance is not enough");
        }else if (amount<= 0){
            System.out.print("amount is not enough");
        }else {
            this.balance-=amount;
        }
        System.out.print("your balance: ");
        return balance;
    }

    public int transferTo(Account another, int amount){
        if (amount<=0){
            System.out.print("amount is not enough");
        }else if(balance<=amount){
            System.out.print("balance is not enough");
        }else{
            another.balance+=amount;
            this.balance-=amount;
        }
        System.out.print("your balance: ");
        return balance;
    }

    public String toString(){
        return "ID: "+id +"\nNAME: "+name +"\nBALANCE: "+balance;
    }
}
