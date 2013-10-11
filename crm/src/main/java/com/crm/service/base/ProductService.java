package com.crm.service.base;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.crm.entiry.Product;
import com.crm.repository.ProductDao;

/**
 * 用户管理类.
 * 
 * @author calvin
 */
// Spring Service Bean的标识.
@Component
@Transactional
public class ProductService {
	private static Logger logger = LoggerFactory.getLogger(ProductService.class);

	private ProductDao productDao;

	public List<Product> getAll() {
		return (List<Product>) productDao.findAll();
	}

	public Product get(Long id) {
		return productDao.findOne(id);
	}

	public void create(Product salPlan) {
		productDao.save(salPlan);
	}

	public void update(Product salPlan) {
		productDao.save(salPlan);
	}

	public void delete(Long id) {
		logger.info("Delete Product id = " + id);
		productDao.delete(id);
	}

	@Autowired
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
}
