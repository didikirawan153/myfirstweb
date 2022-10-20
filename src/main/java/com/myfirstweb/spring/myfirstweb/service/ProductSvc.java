package com.myfirstweb.spring.myfirstweb.service;

import com.myfirstweb.spring.myfirstweb.form.ProductForm;
import com.myfirstweb.spring.myfirstweb.model.ProductModel;

import java.util.List;

public interface ProductSvc {
    ProductModel create(ProductForm form);

    List<ProductModel> getAll();
}
