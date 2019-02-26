package com.employee.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.springboot.model.EmpUser;

@Repository
public interface EmpUserRepository extends JpaRepository<EmpUser, Long> {

	EmpUser findByName(String name);

}
