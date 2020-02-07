package com.accenture.lkm.service;

import java.util.List;

import com.accenture.lkm.business.bean.EmployeeBean;

public interface EmployeeService {
	EmployeeBean addEmployee(EmployeeBean bean)throws Exception;

	List<EmployeeBean> getAllEmployeeDetails()throws Exception;

}
