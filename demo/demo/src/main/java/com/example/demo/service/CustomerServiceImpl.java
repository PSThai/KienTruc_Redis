package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.CustomerDao;
import com.example.demo.entity.Customer;



@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	@Override
	public Customer findCustomerById(String id) {
		// TODO Auto-generated method stub
		return customerDao.findCustomerById(id);
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerDao.getAllCustomer();
	}

	@Override
	public Customer addCustomer(Customer customeradd) {
		// TODO Auto-generated method stub
		return customerDao.addCustomer(customeradd);
	}

	@Override
	public String delete(String id) {
		// TODO Auto-generated method stub
		return customerDao.delete(id);
	}

}
