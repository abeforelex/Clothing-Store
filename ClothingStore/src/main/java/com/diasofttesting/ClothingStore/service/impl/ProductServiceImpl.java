package com.diasofttesting.ClothingStore.service.impl;

import com.diasofttesting.ClothingStore.entity.Product;
import com.diasofttesting.ClothingStore.exception.ResourceNotFoundException;
import com.diasofttesting.ClothingStore.repository.ProductRepository;
import com.diasofttesting.ClothingStore.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Alexey Dolzhenko
 * 11/15/2021
 */

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        super();
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(long id) {
        Optional<Product> product = productRepository.findById(id);
        if(product.isPresent()){
            return product.get();
        } else {
            throw new ResourceNotFoundException("Product", "id", id);
        }
    }
}
