package com.MedManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MedManagement.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	//List<Customer> findById(int id);
	
	List<Customer> findByCustomerName(String name);
}
