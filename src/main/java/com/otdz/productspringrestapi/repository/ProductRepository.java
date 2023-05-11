package com.otdz.productspringrestapi.repository;

import com.otdz.productspringrestapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
