package com.accenture.lkm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.lkm.dao.EmployeeDAOWrapper;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private  EmployeeDAOWrapper employeeDAOWrapper;

	public int updateSalary(Double salary, String name) throws Exception {
		return employeeDAOWrapper.updateSalary(salary, name);
	}

	public int updateSalary2(Double salary, String name) throws Exception {
		return employeeDAOWrapper.updateSalary2(salary, name);
	}

	
	
}
