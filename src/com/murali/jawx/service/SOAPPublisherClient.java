package com.murali.jawx.service;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.murali.jawx.bean.Employee;

public class SOAPPublisherClient {

	public static void main(String[] args) throws MalformedURLException{
		// TODO Auto-generated method stub

		URL wsdlURL = new URL("http://localhost:8888/ws/employee?wsdl");
		
		QName qname = new QName("http://service.jawx.murali.com/","EmployeeServiceImplService");
		
		Service service = Service.create(wsdlURL, qname);
		
		EmployeeService empService = service.getPort(EmployeeService.class);
		
		Employee e1 = new Employee();
		e1.setEmpid(12345);
		e1.setAge(25);
		e1.setEmpName("Murali");
		
		System.out.println(empService.addEmployee(e1));
		
		System.out.println(empService.getEmployee(12345));
		
	}

}
