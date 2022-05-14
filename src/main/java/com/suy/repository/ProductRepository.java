package com.suy.repository;

import com.suy.entity.Product;
import com.suy.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * @author suy
 */

public interface ProductRepository extends JpaRepository<Product,Serializable> {


    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    Product save(Product s);
}