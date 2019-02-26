package com.employee.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee.springboot.model.EmpUser;
import com.employee.springboot.repositories.EmpUserRepository;




@Service
@Transactional
public class EmpUserServiceImpl implements EmpUserService{

	@Autowired
	private EmpUserRepository userRepository;

	public EmpUser findById(Long id) {
		return userRepository.findOne(id);
	}

	public EmpUser findByName(String name) {
		return userRepository.findByName(name);
	}

	public void saveUser(EmpUser user) {
		userRepository.save(user);
	}

	public void updateUser(EmpUser user){
		saveUser(user);
	}

	public void deleteUserById(Long id){
		userRepository.delete(id);
	}

	public void deleteAllUsers(){
		userRepository.deleteAll();
	}

	public List<EmpUser> findAllUsers(){
		return userRepository.findAll();
	}

	public boolean doesUserExist(EmpUser user) {
		return findByName(user.getName()) != null;
	}

}
