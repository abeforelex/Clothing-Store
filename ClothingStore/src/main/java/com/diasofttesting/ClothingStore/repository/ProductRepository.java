package com.diasofttesting.ClothingStore.repository;

import com.diasofttesting.ClothingStore.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Alexey Dolzhenko
 * 11/15/2021
 */

public interface ProductRepository extends JpaRepository<Product, Long> {

}
