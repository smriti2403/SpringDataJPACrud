package com.accenture.lkm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOWrapper {

	@Autowired
	private EmployeeDAO employeeDAO;

	public  int updateSalary(Double salary,String name) throws Exception {
		int resultRet = 0;
		try {
			resultRet = employeeDAO.updateSalary(salary, name);
		} catch (Exception ex) {
			throw ex;
		}
		return resultRet;
	}

	public int updateSalary2(Double salary,String name) throws Exception {
		int resultRet = 0;
		try {
			resultRet = employeeDAO.updateSalary2(name, salary);
		} catch (Exception ex) {
			throw ex;
		}
		return resultRet;
	}

}
