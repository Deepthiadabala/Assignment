package com.main;

import java.util.Scanner;
import com.model.Employee;
import com.service.CreationOfEmployees;

public class EmployeeSwitch {

	public static void main(String[] args) {

		System.out.println("Enter How many operations you want to perform");

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter what of the following operation you want to perform");
		System.out.println("for create press 1");
		System.out.println("for read press 2");
		System.out.println("for  update 3");
		System.out.println("for delete press 4");

		Employee[] employeesCreated = {};
		
		boolean shouldTrue = true;

		
		while (shouldTrue) {
			int exp = scan.nextInt();
			switch (exp) {

			case 1:
				// create
				CreationOfEmployees creationOfEmployees = new CreationOfEmployees();
				System.out.println("Enter How many members of Employees you want to enter");
				int numOfEmp = scan.nextInt(); // Number of employees user want to perform operations

				employeesCreated = creationOfEmployees.createOfEmployees(numOfEmp);
				// System.out.println(employeesCreated.length+"length");

				break;
				
			case 2:
				if (employeesCreated.length == 0) {
					System.out.println("No Data to read Please create data to read");
				} else {
					for (int i = 0; i < employeesCreated.length; i++) {
						System.out.println(employeesCreated[i].getEmpId());
					}
				}
				break;
			default:
				shouldTrue = false;
				break;
			

			}//switch ending
			
			
			
		}//while ending

	}//main ending

}//class ending
