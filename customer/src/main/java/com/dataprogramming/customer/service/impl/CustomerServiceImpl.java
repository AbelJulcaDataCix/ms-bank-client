package com.dataprogramming.customer.service.impl;

import com.dataprogramming.customer.entity.Customer;
import com.dataprogramming.customer.repository.CustomerRepository;
import com.dataprogramming.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Mono<Customer> create(Customer customer) {
        return customerRepository.save(customer);
    }
}
