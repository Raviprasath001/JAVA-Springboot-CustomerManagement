package com.mayuratech.customermanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.mayuratech.customermanagement.model.Customers;

//Extending the CrudRepository which has default methods for http request options
public interface CustomerRepository extends CrudRepository<Customers, Integer> {

	Customers findAllById(int id);

}
