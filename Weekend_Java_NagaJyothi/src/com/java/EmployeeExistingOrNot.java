package com.java;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeExistingOrNot 
{
	//@Test
	public boolean getDetails()
	{
		EmployeeDetails employee=new EmployeeDetails();
		List<Employee> employeeList=employee.employeeDetails();
		Optional<Employee>optional=employeeList.stream().filter(entry->entry.getName().equalsIgnoreCase("AKhila")).findFirst();
		if(optional.get().getName() != null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) {
		EmployeeExistingOrNot result=new EmployeeExistingOrNot();
		boolean b=result.getDetails();
		System.out.println(b);
		
	}
	
	

}
