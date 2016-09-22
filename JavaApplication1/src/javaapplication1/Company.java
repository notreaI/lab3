/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author student
 */
public class Company {
    String name;
    String id;
    float salary;
    String supervisor;
    String rank;
    float otHour;
    float otRate;

    public Company(String name, String id, float salary, String supervisor, String rank, float otHour, float otRate) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.supervisor = supervisor;
        this.rank = rank;
        this.otHour = otHour;
        this.otRate = otRate;
    }
    
    public void addSalary(float percent){
        salary = salary * (1+percent/100);
    }
    public float pay(){
        return salary + otHour * otRate;
    }

    public void setOtHour(float otHour) {
        this.otHour = otHour;
    }
    
}
