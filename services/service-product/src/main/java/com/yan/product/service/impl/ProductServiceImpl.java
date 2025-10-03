package com.yan.product.service.impl;

import com.yan.product.bean.Product;
import org.springframework.stereotype.Service;
import com.yan.product.service.ProductService;

import java.math.BigDecimal;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public Product getProductById(Long productId) {
        Product product = new Product();
        product.setId(productId);
        product.setPrice(new BigDecimal("99"));
        product.setProductName("苹果-" + productId);
        product.setNum(2);


        return product;
    }
}
