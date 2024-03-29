package com.neimerc.springdemo.service;

import java.util.List;

import com.neimerc.springdemo.model.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
	
}
