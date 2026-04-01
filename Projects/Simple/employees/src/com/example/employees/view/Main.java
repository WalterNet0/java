package com.example.employees.view;

import com.example.employees.model.Employee;
import com.example.employees.service.EmployeeService;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();

        System.out.print("How many employees will be registered? ");
        int quantity = scanner.nextInt();

        scanner.nextLine();

        for(int i = 0; i < quantity; i++){
            System.out.println("\nEmployee #" + (i + 1));

            System.out.print("Id: ");
            int id = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            scanner.nextLine();

            Employee employee = new Employee(id, name, salary);
            employeeService.AddEmployee(employee);
        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter the percentage: ");
        double percentage = scanner.nextDouble();

        scanner.nextLine();

        employeeService.IncreaseSalary(id, percentage);

        System.out.println("\nList of employees:");
        employeeService.GetAllEmployees();
    }
}
