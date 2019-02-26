package com.employee.springboot.service;


import java.util.List;

import com.employee.springboot.model.EmpUser;

public interface EmpUserService {
	
	EmpUser findById(Long id);

	EmpUser findByName(String name);

	void saveUser(EmpUser user);

	void updateUser(EmpUser user);

	void deleteUserById(Long id);

	void deleteAllUsers();

	List<EmpUser> findAllUsers();

	boolean doesUserExist(EmpUser user);
}