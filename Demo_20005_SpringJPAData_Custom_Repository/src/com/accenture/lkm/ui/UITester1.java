package com.accenture.lkm.ui;

import java.util.Date;
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
			
		// 1 Add Employee
		//addEmployee(employeeServiceIMPL);
		
		// 2 Get Employee Employee
		getAllEmployeeDetails(employeeServiceIMPL);
	
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	public static void addEmployee(EmployeeService serviceImpl) {

		EmployeeBean bean = new EmployeeBean();
		bean.setInsertTime(new Date());
		bean.setName("New Employee");
		bean.setRole("Sr.Analyst");
		bean.setSalary(10.0);
		
		try {

			int id = serviceImpl.addEmployee(bean).getId();
			System.out.println("Employee Registered Successfully: " + id);
	
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}

	public static void getAllEmployeeDetails(EmployeeService serviceImpl) {

		try {

			List<EmployeeBean> listEmployeeBean = serviceImpl.getAllEmployeeDetails();

			System.out.println("Employee Details");
			System.out.println("================");
			for (EmployeeBean employeeBean : listEmployeeBean) {
				System.out.println("Name: " + employeeBean.getName()
								  +",Salary: " + employeeBean.getSalary()
								  +",Role: " + employeeBean.getRole());
			}
			
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}
}