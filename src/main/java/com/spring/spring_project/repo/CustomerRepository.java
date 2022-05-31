package com.spring.spring_project.repo;

import com.spring.spring_project.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
