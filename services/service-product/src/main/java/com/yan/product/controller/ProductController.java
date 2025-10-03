package com.yan.product.controller;

import com.yan.product.bean.Product;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.yan.product.service.ProductService;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    //查询商品
    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable("id") Long productId,
                              HttpServletRequest request) {
        String header = request.getHeader("X-Token");
        System.out.println("hello ... token=【" + header + "】");
        Product product = productService.getProductById(productId);

        return product;
    }

}
