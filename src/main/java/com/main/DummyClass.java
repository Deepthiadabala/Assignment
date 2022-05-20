package com.main;

import java.util.Scanner;
import com.model.Employee;
import com.service.CreationOfEmployees;

public class DummyClass {
	public static void main(String[] args) {
		System.out.println("Enter How many operations you want to perform");

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter what of the following operation you want to perform");
		System.out.println("for create press 1");
		System.out.println("for read press 2");
		System.out.println("for  update 3");
		System.out.println("for delete press 4");

		Employee[] employeesCreated = new Employee[4];
		boolean shouldTrue = true;
		int count = 1;
		

		while (shouldTrue) {
			int exp = scan.nextInt();
			switch (exp) {
			case 1: 
				System.out.println("Enter How many members of Employees you want to enter");
				int numOfEmp = scan.nextInt(); // Number of employees user want to perform operations
				CreationOfEmployees creationOfEmployees = new CreationOfEmployees();
				employeesCreated = creationOfEmployees.createOfEmployees(numOfEmp);

				break;
			case 2:
				System.out.println(employeesCreated.length+"length");
				for (int i = 0; i < employeesCreated.length; i++) {
					System.out.println(employeesCreated[i].getEmpId());
					System.out.println(employeesCreated[i].getEmpName());
				}	
				break;
			}
			

		}

	}
}
