package com.accenture.lkm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.lkm.entity.EmployeeEntity;


@SuppressWarnings("rawtypes")

@RepositoryDefinition(idClass = Integer.class, domainClass = EmployeeEntity.class)
@Transactional(value = "txManager")
// name of TransactionManger can be any thing
public interface EmployeeDAO {
	@Query(name="EMP.query1_getAllEmployeesStringFunctions")
	List stringFunctions(); 
	
	@Query(name="EMP.query3_getAverageSalaryForEmployeesByRole") 
	List groupByExampleNamed();
	

}
// if @query is not having a valid query then 
// then method signature is checked for the query method
// query translation 
	