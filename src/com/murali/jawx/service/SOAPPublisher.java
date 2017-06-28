package com.murali.jawx.service;

import javax.xml.ws.Endpoint;

public class SOAPPublisher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Endpoint.publish("http://localhost:8888/ws/employee", new EmployeeServiceImpl());

	}

}
