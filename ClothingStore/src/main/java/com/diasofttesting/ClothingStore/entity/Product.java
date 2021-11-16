package com.diasofttesting.ClothingStore.entity;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

/**
 * @author Alexey Dolzhenko
 * 11/15/2021
 */

// Creating entity named "Product" by using "@Entity" annotation
// Using "@Data" to reduce the amount of code

@Data
@Entity
@Table(name = "Product")

public class Product {

    // Creating auto-generated primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Product_Name", nullable = false)
    private String productName;

    @Column(name = "Season")
    private String categorySeason;

    @Column(name = "Gender")
    private String categoryGender;

    @Column(name = "Size")
    private char categorySize;

    @Column(name = "Description")
    @Type(type = "text")
    private String description;

    @Column(name = "Price")
    private int price;

    @Column(name = "Quantity")
    private int quantity;
}
