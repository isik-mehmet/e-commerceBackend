package com.example.demo.service;
import com.example.demo.model.Product;


import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
    public List<Product> getProductList(){
        return productRepository.findAll(); }
    public Product findById(Long id){
        return productRepository.findById(id).get();
    }

    public List<Product> findByCategoryName( String CategoryName){
        return productRepository.findByCategoryName(CategoryName);
    }

    public void deleteProduct(Long Id) {
        productRepository.deleteById(Id);
    }
}
