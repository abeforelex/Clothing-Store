package com.diasofttesting.ClothingStore.service;

import com.diasofttesting.ClothingStore.entity.Product;

import java.util.List;

/**
 * @author Alexey Dolzhenko
 * 11/15/2021
 */

public interface ProductService {
    Product saveProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(long id);
}
