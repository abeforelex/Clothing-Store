package com.diasofttesting.ClothingStore.controller;

import com.diasofttesting.ClothingStore.entity.Product;
import com.diasofttesting.ClothingStore.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Alexey Dolzhenko
 * 11/15/2021
 */

@RestController
@RequestMapping("/api")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        super();
        this.productService = productService;
    }

    // This method is used to add products to our database
    @PostMapping("/addProducts")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
        return new ResponseEntity<Product>(productService.saveProduct(product), HttpStatus.CREATED);
    }

    // This method is used to get all products from our database
    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // This method is used to get a product using ID
    // Example: http://localhost:8080/api/getProductById/1
    @GetMapping("/getProductById/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") long productId) {
        return new ResponseEntity<Product>(productService.getProductById(productId), HttpStatus.OK);
    }
}
