package com.crm.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.crm.entiry.Storage;

public interface StorageDao extends PagingAndSortingRepository<Storage, Long> {
}
