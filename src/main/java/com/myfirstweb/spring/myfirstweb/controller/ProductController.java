package com.myfirstweb.spring.myfirstweb.controller;

import com.myfirstweb.spring.myfirstweb.form.ProductForm;
import com.myfirstweb.spring.myfirstweb.model.ProductModel;
import com.myfirstweb.spring.myfirstweb.service.ProductSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/product")
public class ProductController {

    private final ProductSvc productSvc;

    @Autowired
    public ProductController(ProductSvc productSvc) {
        this.productSvc = productSvc;
    }

    @PostMapping
    public ProductModel create(@RequestBody ProductForm form){
        return productSvc.create(form);
    }

    @GetMapping(value = "/get-all")
    public List<ProductModel> getAll(){
        return productSvc.getAll();
    }


//    @GetMapping
//    public String sayHelloHtml(){
//        return "hallo/sayHallo";
//    }
}
