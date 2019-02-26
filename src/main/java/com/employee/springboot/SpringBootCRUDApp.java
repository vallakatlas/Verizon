package com.employee.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.employee.springboot.configuration.JpaConfiguration;
import com.employee.springboot.repositories.EmpUserRepository;


@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.employee.springboot"})
@EnableJpaRepositories("com.employee.springboot.repositories")
public class SpringBootCRUDApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCRUDApp.class, args);
	}
	
	
}
