package com.service;

import java.util.Scanner;

import com.model.Employee;

public class CreationOfEmployees {
	public Employee[] createOfEmployees(int numOfEmp) {
		Scanner scan = new Scanner(System.in);
		Employee[] employees = new Employee[numOfEmp];
		for (int i = 0; i < numOfEmp; i++) {
			System.out.println("Enter Employee ID");
			int id = scan.nextInt();
			System.out.println("Enter Employee Name");
			String name = scan.next();
			System.out.println("Enter Employee Salary");
			double salary = scan.nextDouble();
			Employee employeeCreated = new Employee(id,name,salary);//New Employees will be created here
			employees[i]=employeeCreated;//New Employees created will stored in array
			
		}
		scan.close();
		return employees;
		

	}
	
}
