package com.fatec.salaobeleza.service;

import com.fatec.salaobeleza.model.Product;
import com.fatec.salaobeleza.repository.ProductRepository;
import java.util.List;

import org.jcp.xml.dsig.internal.SignerOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products) {
        return repository.saveAll(products);
    }

    public List<Product> getProducts() {
        return repository.findAll();
    }

    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Product getProductByName(String name) {
        return repository.findByName(name);
    }

    public String deleteById(int id) {
        repository.deleteById(id);
        return "Product: " + repository.findById(id).orElse(null) + "  removido!";
    }
}
