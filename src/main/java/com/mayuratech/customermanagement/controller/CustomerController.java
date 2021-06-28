package com.mayuratech.customermanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mayuratech.customermanagement.model.Customers;
import com.mayuratech.customermanagement.repository.CustomerRepository;
import com.mayuratech.customermanagement.service.CustomerService;

@RestController
@RequestMapping("/shop")
public class CustomerController {

	// getting the methods which are available in service class by autowired it
	@Autowired
	CustomerService customerService;

	// adding a new customer by using POST request
	@PostMapping("/addcustomer")
	public String bookticket(@RequestBody List<Customers> customer) {
		customerService.saveOrUpdate(customer);
		return "No of new Customers added : " + customer.size();
	}

	// Getting details of all customer by using GET request
	@GetMapping("/getallcustomers")
	public List<Customers> getCustomers() {
		return customerService.getAllCustomers();
	}

	// Getting details of a customer through their ID by using GET request
	@GetMapping("/getcustomersbyid/{id}")
	public Customers getTicketsId(@PathVariable("id") int id) {
		return customerService.getTicketById(id);
	}

	// Deleting details of a customer by using DELETE request
	@DeleteMapping("/deletecustomersbyid/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		customerService.deletingById(id);
		return "Successfully Deleted !!";
	}

	// Updating details in a particular customer by using PUT mapping
	@PutMapping("/updatebyid/{id}")
	public String updateStudent(@PathVariable int id, @RequestBody Customers customer) {
		customerService.updateById(id, customer);
		return "Successfully updated !!!";
	}
}
