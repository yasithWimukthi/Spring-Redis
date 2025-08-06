package com.codebook.springredis.Repository;

import com.codebook.springredis.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}
