package com.example.employees.service;

import com.example.employees.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    //Methods
    public void AddEmployee(Employee employee){
        employees.add(employee);
    }

    public void GetAllEmployees(){
        for(Employee employee : employees){
            System.out.println(employee);
        }
    }

    public void IncreaseSalary(int id, double percentage){
        for(Employee employee : employees){
            if(employee.getId() == id){
                double newSalary =employee.getSalary() * (1 + percentage / 100);
                employee.setSalary(newSalary);

                System.out.printf("Employee %d salary increased to %.2f successfully!\n", id, newSalary);
            }
        }
    }
}
