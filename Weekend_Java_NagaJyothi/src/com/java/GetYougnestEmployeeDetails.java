package com.java;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class GetYougnestEmployeeDetails {
	public void getEmployeeDetails() {
		EmployeeDetails employee = new EmployeeDetails();
		List<Employee> list = employee.employeeDetails();
		// list.stream().sorted(Comparator.com)
		
		
		
//		Map<String, List<Employee>> map=list.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//	
//		for (Entry<String, List<Employee>> entry : map.entrySet()) {
//			
//			System.out.println(entry);
//			
//		}
//		Comparator<Entry<Object, Employee>> map1=Entry.comparingByValue(Comparator.comparing(Employee::getAge));
//		System.out.println(map1);
//		}
	
	
//     list.stream().collect(Collectors.groupingBy(Employee::getDepartment)).entrySet()
//		.forEach(entry -> {System.out.println(entry.getKey());
//		entry.getValue().stream().min(Comparator.comparing(Employee::getAge));
//		
//		});
//	}
		list.stream().collect(Collectors.groupingBy(Employee::getDepartment)).entrySet().
		forEach(entry -> {
			System.out.println(entry.getKey());
			Optional<Employee> optional = entry.getValue().stream().min(Comparator.comparing(Employee::getAge));
			System.out.println(optional.get());
		});
	}

	public static void main(String[] args) {
		GetYougnestEmployeeDetails details = new GetYougnestEmployeeDetails();
		details.getEmployeeDetails();
	}

}
