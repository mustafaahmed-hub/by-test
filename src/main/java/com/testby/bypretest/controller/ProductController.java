package com.testby.bypretest.controller;

import com.testby.bypretest.model.Product;
import com.testby.bypretest.model.ProductList;
import com.testby.bypretest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/")
public class ProductController {
        @Autowired
        private ProductService productService;
        @PostMapping("sortProducts")
        public ResponseEntity sortProducts(@RequestBody ProductList productList){
            ProductList sortedProducts = productService.sortProducts(productList);
            return ResponseEntity.status(HttpStatus.OK).body(sortedProducts);
        }
        @GetMapping("check")
        public ResponseEntity check(){
            return ResponseEntity.status(HttpStatus.OK).body("service online");
        }
}
