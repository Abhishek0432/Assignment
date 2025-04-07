package com.cloudvandhana;
import java.util.ArrayList;
import java.util.List;

class Employee {
     int id;
     String name;
     double salary;
    
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }

    public static void main(String[] args) {
       
        Employee emp1 = new Employee(101, "Abhishek", 10000);
        Employee emp2 = new Employee(102, "Bhushan", 20000);
        Employee emp3 = new Employee(103, "Omkar", 30000);
        
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        
        System.out.println("Employee Details:");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
  }
