package com.myfirstweb.spring.myfirstweb.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Data
@Entity
@Table(name = "product")
@NoArgsConstructor
public class ProductModel extends BaseDao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "price", nullable = false)
    private Double price;

}
