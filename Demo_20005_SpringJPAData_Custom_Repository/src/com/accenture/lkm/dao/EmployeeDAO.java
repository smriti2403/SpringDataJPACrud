package com.accenture.lkm.dao;

import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.lkm.entity.EmployeeEntity;

@RepositoryDefinition(idClass=Integer.class,domainClass=EmployeeEntity.class)
@Transactional(value="txManager") // name of TransactionManger can be any thing
public interface EmployeeDAO{
	EmployeeEntity save (EmployeeEntity en);
	Iterable<EmployeeEntity> findAll();
	
}
// this is how to stop exposing all the method