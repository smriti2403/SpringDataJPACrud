package com.accenture.lkm.service;

import java.util.List;

import com.accenture.lkm.business.bean.EmployeeBean;
@SuppressWarnings("rawtypes")

public interface EmployeeService {
	 List<EmployeeBean> getAllEmployeesBySalary(Double salary) throws Exception;	
	 List<EmployeeBean> getAllEmployeesBySalary2(Double salary)throws Exception;
	 List getRolesAndCountOfEmployeesInEachRole()throws Exception;
		
}
