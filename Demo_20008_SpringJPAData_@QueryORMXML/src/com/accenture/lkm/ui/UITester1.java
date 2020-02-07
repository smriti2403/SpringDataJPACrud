package com.accenture.lkm.ui;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.accenture.lkm.service.EmployeeService;
@SuppressWarnings("rawtypes")
public class UITester1 {

	public static void main(String[] args) {
		
		EmployeeService employeeServiceIMPL=null;
		try{
			
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/accenture/lkm/resources/cst-main-config.xml");
			employeeServiceIMPL = (EmployeeService) applicationContext.getBean("employeeServiceImpl");
		
		
			getAllEmployeeDetails1(employeeServiceIMPL);

			//getAllEmployeeDetails2(employeeServiceIMPL);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}

	

	public static void getAllEmployeeDetails1(EmployeeService serviceImpl) {

		try {

			List listEmployeeBean = serviceImpl.groupByExampleNamed();
			for(Object obj:listEmployeeBean)
			{
				Object[]  objArray = (Object[])obj;
				System.out.println(objArray[0]+","+objArray[1]);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}
	public static void getAllEmployeeDetails2(EmployeeService serviceImpl) {

		try {

			List list = serviceImpl.stringFunctions();
			
			for(Object obj:list)
			{
				Object[] objArray = (Object[])obj;
				System.out.println(objArray[0]+","+objArray[1]+","+objArray[2]+","+objArray[3]+"\n");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}


}