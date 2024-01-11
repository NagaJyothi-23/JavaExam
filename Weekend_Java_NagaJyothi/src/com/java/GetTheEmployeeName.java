package com.java;

import java.util.List;
import java.util.stream.Collectors;

public class GetTheEmployeeName {
public void getEmployeeNames()
{
	EmployeeDetails employee=new EmployeeDetails();
	List<Employee> list=employee.employeeDetails();
	list.stream().filter(entry->entry.getYearOfJoining()>2015).collect(Collectors.toList())
	.forEach(entry->System.out.println(entry.getName()));
}
public static void main(String[] args) {
	GetTheEmployeeName names=new GetTheEmployeeName();
	names.getEmployeeNames();
	
}
}
