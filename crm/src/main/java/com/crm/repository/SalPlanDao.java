package com.crm.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.crm.entiry.SalPlan;

public interface SalPlanDao extends PagingAndSortingRepository<SalPlan, Long> {
}
