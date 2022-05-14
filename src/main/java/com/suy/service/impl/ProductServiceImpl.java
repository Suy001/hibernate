package com.suy.service.impl;

import com.suy.entity.Product;
import com.suy.repository.ProductRepository;
import com.suy.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author suy
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductRepository productRepository;
    @Override
    public Product save(Product entity) {
        return productRepository.save(entity);
    }
}
