package com.fatec.salaobeleza.repository;

import com.fatec.salaobeleza.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByName(String name);

}
