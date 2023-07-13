package com.rama.customer.service;

import com.rama.customer.model.Customer;
import com.rama.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers(){
      return customerRepository.findAll();
    }

    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public Customer getCustomerById(int id){
        return customerRepository.findById(id).get();
    }

    public void deleteCustomerById(int id){
        customerRepository.deleteById(id);
    }
}
