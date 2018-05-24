package com.river.bend.basic;

import java.util.Date;
import java.util.Objects;

/**
 * 一个方法可以访问所属类的所有对象的私有数据
 * @author yuhairui
 * @version 1.1.1
 * @since
 *
 */
public class Employee implements  Comparable<Employee> ,Cloneable {

    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    /**
     *
     * @return the salary of the employee
     */

    public double getSalary() {
        return salary;
    }

    /**
     *
     * @param byPercent
     */
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent/100;
    }

    @Override
    public boolean equals(Object otherObject){
        if(this == otherObject){
            return true;
        }

        if (otherObject == null){
            return false;
        }

        if(getClass() != otherObject.getClass()){
            return  false;
        }
        Employee other = (Employee)otherObject;

        return Objects.equals(name,other.name) && salary == other.salary && Objects.equals(hireDay,((Employee) otherObject).hireDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,salary,hireDay);
    }

    public static double max(double... values){
        double largest = Double.MIN_VALUE;
        for(double v:values){
            if(v>largest){ largest=v;}
        }
        return largest;
    }


    /**
     *Compares employees by salary
     * @param o another Employee object
     * @return  a negative value if this employee has a lower salary than o
     */
    @Override
    public int compareTo(Employee o) {
        return Double.compare(salary,o.salary);
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        Employee cloned = (Employee)super.clone();
        cloned.hireDay =(Date)hireDay.clone();
        return cloned;
    }
}
