package com.murali.jawx.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.murali.jawx.bean.Employee;

@WebService
@SOAPBinding(style=SOAPBinding.Style.RPC)
public interface EmployeeService {

	@WebMethod
	public boolean addEmployee(Employee emp);
	
	@WebMethod
	public boolean deleteEmployee(int empId);
	
	@WebMethod
	public Employee getEmployee(int empid);
	
}
