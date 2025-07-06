package org.example;

public class Employee {
    private String id;
    private String name;
    private int salary;

    public Employee(String id,String name,int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getAnnualSalary() {
        System.out.print("annual salary for "+ name+": ");
        return salary*12;
    }

    public int raisedSalary(int percent){
        int newSalary = salary+((salary*percent)/100);
        System.out.print("raised salary for "+ name+": ");
        return salary = newSalary;
    }

    public String toString(){
        return "ID: "+id+"\nname: "+name+"\nsalary: "+salary;
    }




}
