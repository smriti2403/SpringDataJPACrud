package com.accenture.lkm.ui;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.accenture.lkm.business.bean.EmployeeBean;
import com.accenture.lkm.service.EmployeeService;

public class UITester1 {

	public static void main(String[] args) {
		
		EmployeeService employeeServiceIMPL=null;
		try{
			
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/accenture/lkm/resources/cst-main-config.xml");
			employeeServiceIMPL = (EmployeeService) applicationContext.getBean("employeeServiceImpl");
		
		
			//getAllEmployeeDetails1(employeeServiceIMPL);

			//getAllEmployeeDetails2(employeeServiceIMPL);
			
			//getAllEmployeeDetails3(employeeServiceIMPL);
			
			//getAllEmployeeDetails4(employeeServiceIMPL);
			
			getAllEmployeeDetails5(employeeServiceIMPL);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}


	public static void getAllEmployeeDetails1(EmployeeService serviceImpl) {

		try {

			List<EmployeeBean> listEmployeeBean = serviceImpl.findAllEmployeesBySalaryGreaterThanEqual(300.0);
			for (EmployeeBean employeeBean : listEmployeeBean) {
				System.out.println("Name: " + employeeBean.getName()
								  +",Salary: " + employeeBean.getSalary()
								  +",Role: " + employeeBean.getRole());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}
	
	public static void getAllEmployeeDetails2(EmployeeService serviceImpl) {

		try {

			List<EmployeeBean> listEmployeeBean = serviceImpl.findAllEmployeesBySalaryGreaterThanEqualOrderByIdDesc(30000.0);
			for (EmployeeBean employeeBean : listEmployeeBean) {
				System.out.println("Name: " + employeeBean.getName()
								  +",Salary: " + employeeBean.getSalary()
								  +",Role: " + employeeBean.getRole());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}
	
	public static void getAllEmployeeDetails3(EmployeeService serviceImpl) {

		try {

			List<EmployeeBean> listEmployeeBean = serviceImpl.findAllEmployeesBySalaryBetween(10000.0, 50000.0);
			for (EmployeeBean employeeBean : listEmployeeBean) {
				System.out.println("Name: " + employeeBean.getName()
								  +",Salary: " + employeeBean.getSalary()
								  +",Role: " + employeeBean.getRole());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

	public static void getAllEmployeeDetails4(EmployeeService serviceImpl) {

		try {

			List<EmployeeBean> listEmployeeBean = serviceImpl.findAllEmployeesByNameContainingOrderBySalaryDesc("o");
			for (EmployeeBean employeeBean : listEmployeeBean) {
				System.out.println("Name: " + employeeBean.getName()
								  +",Salary: " + employeeBean.getSalary()
								  +",Role: " + employeeBean.getRole());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}
	
	
	public static void getAllEmployeeDetails5(EmployeeService serviceImpl) {

		try {

			List<EmployeeBean> listEmployeeBean = serviceImpl.findAllEmployeesBySalaryGreaterThanEqualAndRole(50000.0, "Manager");
			for (EmployeeBean employeeBean : listEmployeeBean) {
				System.out.println("Name: " + employeeBean.getName()
								  +",Salary: " + employeeBean.getSalary()
								  +",Role: " + employeeBean.getRole());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}
}
//name of the method is translated into query