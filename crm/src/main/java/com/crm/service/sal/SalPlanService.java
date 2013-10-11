package com.crm.service.sal;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springside.modules.utils.DateProvider;

import com.crm.entiry.SalPlan;
import com.crm.repository.SalPlanDao;

/**
 * 用户管理类.
 * 
 * @author calvin
 */
// Spring Service Bean的标识.
@Component
@Transactional
public class SalPlanService {
	private static Logger logger = LoggerFactory.getLogger(SalPlanService.class);

	private SalPlanDao planDao;
	private DateProvider dateProvider = DateProvider.DEFAULT;

	public List<SalPlan> getAll() {
		return (List<SalPlan>) planDao.findAll();
	}

	public SalPlan get(Long id) {
		return planDao.findOne(id);
	}

	public void create(SalPlan salPlan) {
		salPlan.setPlaDate(dateProvider.getDate());
		planDao.save(salPlan);
	}

	public void update(SalPlan salPlan) {
		planDao.save(salPlan);
	}

	public void delete(Long id) {
		logger.info("Delete Sale Plan id = " + id);
		planDao.delete(id);

	}

	@Autowired
	public void setPlanDao(SalPlanDao planDao) {
		this.planDao = planDao;
	}
	
	public void setDateProvider(DateProvider dateProvider) {
		this.dateProvider = dateProvider;
	}
}
