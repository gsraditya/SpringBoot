package com.controller;

import com.bean.EmployeeBean;

public class EmployeeController {

	public static void main(String[] args) {
		
		EmployeeBean  empobj = new EmployeeBean();
		
		empobj.setEmpId(1234);
		empobj.setEmpName("Aditya");
		empobj.setJoiningDate("29-02-2011");
		empobj.setSalary(1000000.00);
		
		System.out.println(empobj);

	}

}
