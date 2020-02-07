package com.accenture.lkm.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.accenture.lkm.service.EmployeeService;

@SuppressWarnings("rawtypes")
public class UITester1 {

	public static void main(String[] args) {

		EmployeeService employeeServiceIMPL = null;
		try {

			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/accenture/lkm/resources/cst-main-config.xml");
			employeeServiceIMPL = (EmployeeService) applicationContext.getBean("employeeServiceImpl");

			 updateSalary(employeeServiceIMPL);

			// named query update
			//updateSalary2(employeeServiceIMPL);

		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}

	}

	public static void updateSalary(EmployeeService serviceImpl) throws Exception {

		int value = serviceImpl.updateSalary(1290.0, "James");
		System.out.println("Number of Rows updated are: " + value);

	}

	public static void updateSalary2(EmployeeService serviceImpl) throws Exception {

		int value = serviceImpl.updateSalary2(190.0, "James");
		System.out.println("Number of Rows updated are: " + value);

	}

}