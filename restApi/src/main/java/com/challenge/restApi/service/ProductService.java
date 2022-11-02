package com.challenge.restApi.service;

import com.challenge.restApi.domain.Product;

import java.util.List;

public interface ProductService {

    Product addProduct(Product product);
    List<Product> getAllProduct();
}
