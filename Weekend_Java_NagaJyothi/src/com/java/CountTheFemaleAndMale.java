package com.java;

import java.util.List;
import java.util.stream.Collectors;

public class CountTheFemaleAndMale 
{
	public void count()
	{
		EmployeeDetails employee=new EmployeeDetails();
		List<Employee> list=employee.employeeDetails();
		list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()))
		.entrySet().forEach(entry->System.out.println(entry.getKey()+" "+entry.getValue()));
		
	}
	public static void main(String[] args) 
	{
		CountTheFemaleAndMale result=new CountTheFemaleAndMale();
		result.count();
	}

}
