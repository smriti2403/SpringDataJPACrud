package com.accenture.lkm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@SuppressWarnings("rawtypes")
public class EmployeeDAOWrapper {

	@Autowired
	private EmployeeDAO employeeDAO;

	public List stringFunctions() throws Exception {
		List resultRet = null;
		try {
			resultRet = employeeDAO.stringFunctions();
		} catch (Exception ex) {
			throw ex;
		}
		return resultRet;
	}

	public List groupByExampleNamed() throws Exception {
		List resultRet = null;
		try {
			resultRet = employeeDAO.groupByExampleNamed();
		} catch (Exception ex) {
			throw ex;
		}
		return resultRet;
	}

}
