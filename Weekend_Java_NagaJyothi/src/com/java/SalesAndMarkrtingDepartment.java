package com.java;

import java.util.List;
import java.util.stream.Collectors;

public class SalesAndMarkrtingDepartment 
{
	public void count()
	{
		EmployeeDetails employee=new EmployeeDetails();
		List<Employee> list=employee.employeeDetails();
		list.stream().filter(entry->entry.getDepartment().equalsIgnoreCase("Sales")||entry.getDepartment().equalsIgnoreCase("Marketing"))
		.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.groupingBy(Employee::getGender,Collectors.counting())))
		.entrySet().forEach(entry->{System.out.println(entry.getKey());
		entry.getValue().entrySet().forEach(entry1->System.out.println(entry1.getKey()+" "+entry1.getValue()));
		});
	}
	public static void main(String[] args) 
	{
		SalesAndMarkrtingDepartment result=new SalesAndMarkrtingDepartment();
		result.count();
		
	}

}
