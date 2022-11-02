package com.challenge.restApi.controller;

import com.challenge.restApi.domain.Product;
import com.challenge.restApi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productData/v1/")
public class ProductController {

    ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping(value="/product")
    public ResponseEntity<?> insertProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.addProduct(product), HttpStatus.CREATED);
    }

    @GetMapping(value="/products")
    public ResponseEntity<?> getAllProducts(){
        return  new ResponseEntity<>(productService.getAllProduct(),HttpStatus.OK);
    }
}
