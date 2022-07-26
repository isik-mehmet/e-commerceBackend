package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin (origins = "*")
@RequestMapping("product")
@AllArgsConstructor
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public Product save(@RequestBody Product product) {
        return productService.saveProduct(product);}

    @GetMapping("/getAllProduct")
    public List<Product> getAll() {
        return productService.getProductList();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @GetMapping("/category")
    public List<Product> findByCategoryName(String CategoryName) {
        return productService.findByCategoryName(CategoryName);
    }

    @DeleteMapping("/delete/{id}")
    public void DeleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }
}

