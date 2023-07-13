package com.rama.customer.controller;

import com.rama.customer.model.Customer;
import com.rama.customer.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping
    public List<Customer> listAllCustomers(){
      return customerService.getAllCustomers();
    }
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable("id") int id){
        return customerService.getCustomerById(id);
    }
    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }
    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer){
      return customerService.saveCustomer(customer);
    }
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable("id") int id){
        customerService.deleteCustomerById(id);
    }
}
