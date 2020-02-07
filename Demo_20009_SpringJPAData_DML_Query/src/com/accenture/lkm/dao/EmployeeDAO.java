package com.accenture.lkm.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.lkm.entity.EmployeeEntity;


@RepositoryDefinition(idClass = Integer.class, domainClass = EmployeeEntity.class)
@Transactional(value = "txManager")
// name of TransactionManger can be any thing
public interface EmployeeDAO {
	// Focus on below:
	//@Modifying //  if it (@Modifying) is not written then it will throw an exception: DMl operation not supported
	@Query(name="EMP.query4_update_salary")
	 int updateSalary(Double salary,String name);
	
	//@Modifying //  if it (@Modifying) is not written then it will throw an exception: DMl operation not supported
	@Query(name="EMP.query5_update_salary")
	 int updateSalary2(@Param("empName")String name,@Param("newSal") Double salary);
	
}
