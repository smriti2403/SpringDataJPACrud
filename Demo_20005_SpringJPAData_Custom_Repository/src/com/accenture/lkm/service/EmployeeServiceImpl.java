package com.accenture.lkm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.lkm.business.bean.EmployeeBean;
import com.accenture.lkm.dao.EmployeeDAOWrapper;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private  EmployeeDAOWrapper employeeDAOWrapper;

		public  EmployeeBean addEmployee(EmployeeBean bean)throws Exception{
			return employeeDAOWrapper.addEmployee(bean);
		}
		public List<EmployeeBean> getAllEmployeeDetails()throws Exception{
			return employeeDAOWrapper.getAllEmployeeDetails();
		}
		
	
	
	
}
