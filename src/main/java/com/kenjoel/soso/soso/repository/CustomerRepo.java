package com.kenjoel.soso.soso.repository;

import com.kenjoel.soso.soso.dto.RequestJoin;
import com.kenjoel.soso.soso.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
    @Query("SELECT new com.kenjoel.soso.soso.dto.RequestJoin(c.name,p.productName, p.price) FROM Customer c JOIN c.products p")
    public List<RequestJoin> getJoinInformation();
}


