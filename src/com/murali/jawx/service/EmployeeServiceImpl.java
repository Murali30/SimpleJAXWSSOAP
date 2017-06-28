package com.murali.jawx.service;

import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;

import com.murali.jawx.bean.Employee;

@WebService(endpointInterface = "com.murali.jawx.service.EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {

	private static Map<Integer,Employee> employees = new HashMap<Integer,Employee>(); 
	
	@Override
	public boolean addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		if(employees.get(emp.getEmpid()) != null) return false;
		employees.put(emp.getEmpid(), emp);
		return true;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		if(employees.get(empId) == null) return false;
		employees.remove(empId);
		return true;
	}

	@Override
	public Employee getEmployee(int empid) {
		// TODO Auto-generated method stub
		return employees.get(empid);
	}

}
