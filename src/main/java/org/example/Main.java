package org.example;


public class Main {
    public static void main(String[] args) {


        //account class
        System.out.println("\nACCOUNT CLASS\n");
        Account acc1 = new Account("1","zyad"); //without balance
        Account acc2 = new Account("2","ali",500);  //with balance
        Account acc3 = new Account("3","khalid",1000);
        Account acc4 = new Account("4", "ahmed",1500);
        Account acc5 = new Account("5","faisal",5000);

        System.out.println(acc1.getId());   //id=1
        System.out.println(acc2.getName()); //name=ali
        System.out.println(acc3.getBalance());//balance=1000

        //credit
        System.out.println("credit: \n"+acc4.credit(500));   //it will return the balance after the credit


        //debit
        System.out.println("debit: \n"+acc4.debit(500));    //it will return the balance after the debit

        System.out.println(acc4.transferTo(acc1,500));  //will return the balance of acc4
        System.out.println("acc1 balance after the transfer: "+acc1.getBalance());


        System.out.println("\n"+acc5);   //this will use the toString method


        //employee class
        System.out.println("\nEMPLOYEE CLASS\n");
        Employee emp1 = new Employee("1","mohamed",500);
        Employee emp2 = new Employee("2","zyad",1000);
        Employee emp3 = new Employee("3","khalid",1500);
        Employee emp4 = new Employee("4","faisal",2000);
        Employee emp5 = new Employee("5","ahmed",2500);

        System.out.println(emp1.getId());   //id=1
        System.out.println(emp2.getName()); //name=zyad
        System.out.println(emp3.getSalary()); //salary=1500
        System.out.println(emp4.getAnnualSalary()); //annualSalary = 24000
        System.out.println(emp5.raisedSalary(5));

        System.out.println("\n"+emp5);   //toString method
    }
}