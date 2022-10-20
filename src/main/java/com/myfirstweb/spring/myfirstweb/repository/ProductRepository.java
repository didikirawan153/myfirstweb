package com.myfirstweb.spring.myfirstweb.repository;

import com.myfirstweb.spring.myfirstweb.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel,Long> {

}
