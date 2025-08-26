package com.dataprogramming.customer.service;

import com.dataprogramming.customer.entity.Customer;
import reactor.core.publisher.Mono;

public interface CustomerService {
    public Mono<Customer> create(Customer customer);
}
