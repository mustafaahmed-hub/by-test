package com.testby.bypretest.service;

import com.testby.bypretest.model.Product;
import com.testby.bypretest.model.ProductList;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service
public class ProductService {
    public ProductList sortProducts(ProductList productList) {
        Collections.sort(productList.getProductList(),(p1,p2)->{
            return (p2.getProductId().compareTo(p1.getProductId()))!=0?
                    p2.getProductId().compareTo(p1.getProductId()):
                    p2.getLaunchDate().compareTo(p1.getLaunchDate());
        });
        return productList;
    }
}
