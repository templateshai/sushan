package com.river.bend.basic;

public class Manager extends Employee {


    private double bonus;


    public Manager(String name, double salary) {
        super(name, salary);
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary+bonus;
    }
}
