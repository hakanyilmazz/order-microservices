package com.hakanyilmazz.productservice.repository;

import com.hakanyilmazz.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
