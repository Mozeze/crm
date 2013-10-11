package com.crm.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.crm.entiry.BasDict;

public interface BasDictDao extends PagingAndSortingRepository<BasDict, Long>, JpaSpecificationExecutor<BasDict> {

	@Query("select max(dictId) from BasDict")
	Long getMaxDictId();
}
