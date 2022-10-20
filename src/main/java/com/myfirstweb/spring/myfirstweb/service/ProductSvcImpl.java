package com.myfirstweb.spring.myfirstweb.service;

import com.myfirstweb.spring.myfirstweb.form.ProductForm;
import com.myfirstweb.spring.myfirstweb.model.ProductModel;
import com.myfirstweb.spring.myfirstweb.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductSvcImpl implements ProductSvc {

    private final ProductRepository productRepo;

    @Autowired
    public ProductSvcImpl(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public ProductModel create(ProductForm form) {
        return productRepo.save(product(form));
    }

    private ProductModel product(ProductForm form){
        ProductModel product = new ProductModel();
        product.setProductName(form.getProductName());
        product.setPrice(form.getPrice());
        return product;
    }

    @Override
    public List<ProductModel> getAll() {
        return productRepo.findAll();
    }
}
