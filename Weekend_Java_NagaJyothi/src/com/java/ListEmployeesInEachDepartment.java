package com.java;

import java.util.List;
import java.util.stream.Collectors;

public class ListEmployeesInEachDepartment 
{
	public void employeeDetails()
	{
		EmployeeDetails employee=new EmployeeDetails();
		List<Employee> employeeList=employee.employeeDetails();
		employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).entrySet()
		.forEach(entry->{System.out.println(entry.getKey());
		entry.getValue().forEach(entry1->System.out.println(entry1.getName()));
		});
	}
	public static void main(String[] args) {
		
		ListEmployeesInEachDepartment employee=new ListEmployeesInEachDepartment();
		employee.employeeDetails();
	}

}
