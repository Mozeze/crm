package com.crm.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.crm.entiry.Product;

public interface ProductDao extends PagingAndSortingRepository<Product, Long> {
}
