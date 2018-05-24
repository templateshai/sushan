package com.river.bend.basic;

public class EmployeeTest {


    public static void main(String[] args){
        Employee a = new Employee("Alice",7000);
        Employee b = new Employee("Bob",7000);

        System.out.println("Before a="+a.getName());
        System.out.println("Before b="+b.getName());

        swap(a,b);
        System.out.println("After a="+a.getName());
        System.out.println("After b="+b.getName());


    }

    public static void swap(Employee x,Employee y){
        Employee temp = x;
        x= y;
        y=temp;

        System.out.println("End of method: x="+x.getName());
        System.out.println("End of method: y="+y.getName());
    }
}
