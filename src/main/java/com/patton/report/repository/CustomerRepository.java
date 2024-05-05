package com.patton.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patton.report.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
