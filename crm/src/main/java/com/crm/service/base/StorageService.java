package com.crm.service.base;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.crm.entiry.Storage;
import com.crm.repository.StorageDao;

/**
 * 用户管理类.
 * 
 * @author calvin
 */
// Spring Service Bean的标识.
@Component
@Transactional
public class StorageService {
	private static Logger logger = LoggerFactory.getLogger(StorageService.class);

	private StorageDao storageDao;

	public List<Storage> getAll() {
		return (List<Storage>) storageDao.findAll();
	}

	public Storage get(Long id) {
		return storageDao.findOne(id);
	}

	public void create(Storage salPlan) {
		storageDao.save(salPlan);
	}

	public void update(Storage salPlan) {
		storageDao.save(salPlan);
	}

	public void delete(Long id) {
		logger.info("Delete Storage id = " + id);
		storageDao.delete(id);
	}

	@Autowired
	public void setStorageDao(StorageDao storageDao) {
		this.storageDao = storageDao;
	}
}
