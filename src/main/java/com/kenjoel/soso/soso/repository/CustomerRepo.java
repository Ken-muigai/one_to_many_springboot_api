package com.kenjoel.soso.soso.repository;

import com.kenjoel.soso.soso.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}


