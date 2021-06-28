package com.mayuratech.customermanagement.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.mayuratech.customermanagement.model.Customers;
import com.mayuratech.customermanagement.repository.CustomerRepository;

@Service
public class CustomerService {

	// getting the methods which are available in the repository which extend the
	// crudRepository class
	@Autowired
	CustomerRepository customer_Repository;

	// Method for displaying all the customers
	public List<Customers> getAllCustomers() {
		List<Customers> customer = new ArrayList<Customers>();
		return (List<Customers>) customer_Repository.findAll();
	}

	// Methods for displaying details of a particular customer
	public Customers getTicketById(int id) {
		return customer_Repository.findAllById(id);
	}

	// Method for creating a new customer
	public void saveOrUpdate(List<Customers> customer) {
		customer_Repository.saveAll(customer);
	}

	// Method for deleting a particular customer
	public void deletingById(int id) {
		customer_Repository.deleteById(id);
	}

	// Method for updating a particular customer's details
	public Optional<Object> updateById(int id, @RequestBody Customers customer) {
		return customer_Repository.findById(id).map(employee -> {
			employee.setPhonenumber(customer.getPhonenumber());
			return customer_Repository.save(employee);
		});
	}
}