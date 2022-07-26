package com.example.demo.model;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private Double price;

    private String imagePath;

    private String categoryName;

    private String description;


}