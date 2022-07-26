package com.example.demo.repository;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByName( String name);
    Optional<Product> findById( Long id);

    List<Product> findByCategoryName( String CategoryName);




}