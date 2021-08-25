package com.kenjoel.soso.soso.repository;

import com.kenjoel.soso.soso.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Products, Integer> {

}
