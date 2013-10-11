package com.crm.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.crm.entiry.SysUser;

public interface SysUserDao extends PagingAndSortingRepository<SysUser, Long> {
	SysUser findByLoginName(String loginName);
}
