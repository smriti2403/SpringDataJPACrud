package com.accenture.lkm.spring.mainconf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.accenture.lkm.db.config.SpringDBConfig;

@Configuration
@ComponentScan({"com.accenture.lkm.dao","com.accenture.lkm.service"})
@Import(SpringDBConfig.class)
public class SpringMainConfig {

}
/*
 *<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:context="http://www.springframework.org/schema/context"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="
        http://www.springframework.org/schema/beans     
        http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context 
        http://www.springframework.org/schema/context/spring-context.xsd">

    <!-- scanning service and DAO -->
	<context:component-scan base-package="com.accenture.lkm.service, com.accenture.lkm.dao" />
	
	<!-- including the JPA spring integration configuration -->
 	<import resource="cst_jpa_spring_config.xml"/>
</beans> 
 * 
 * */
