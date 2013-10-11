package com.crm.service.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springside.modules.persistence.DynamicSpecifications;
import org.springside.modules.persistence.SearchFilter;
import org.springside.modules.persistence.SearchFilter.Operator;

import com.crm.entiry.BasDict;
import com.crm.repository.BasDictDao;

/**
 * 用户管理类.
 * 
 * @author calvin
 */
// Spring Service Bean的标识.
@Component
@Transactional
public class BasDictService {
	private static Logger logger = LoggerFactory.getLogger(BasDictService.class);

	private BasDictDao dictDao;

	public List<BasDict> getAll() {
		return (List<BasDict>) dictDao.findAll();
	}

	public List<BasDict> searchBasDict(Map<String, Object> searchParams) {
		Map<String, SearchFilter> filters = SearchFilter.parse(searchParams);
		Specification<BasDict> spec = DynamicSpecifications.bySearchFilter(filters.values(), BasDict.class);
		return dictDao.findAll(spec);
	}

	public Long getMaxDictId() {
		return dictDao.getMaxDictId();
	}

	public BasDict get(Long id) {
		return dictDao.findOne(id);
	}

	public void create(BasDict salPlan) {
		dictDao.save(salPlan);
	}

	public void update(BasDict salPlan) {
		dictDao.save(salPlan);
	}

	public void delete(Long id) {
		logger.info("Delete Dict id = " + id);
		dictDao.delete(id);

	}

	public Page<BasDict> getBasDict(Map<String, Object> searchParams, int pageNumber, int pageSize, String sortType) {
		PageRequest pageRequest = buildPageRequest(pageNumber, pageSize, sortType);
		Specification<BasDict> spec = buildSpecification(searchParams);

		return dictDao.findAll(spec, pageRequest);
	}

	/**
	 * 创建分页请求.
	 */
	private PageRequest buildPageRequest(int pageNumber, int pagzSize, String sortType) {
		Sort sort = null;
		if ("auto".equals(sortType)) {
			sort = new Sort(Direction.DESC, "id");
		} else if ("dictType".equals(sortType)) {
			sort = new Sort(Direction.ASC, "dictType");
		} else {
			sort = new Sort(Direction.ASC, sortType);
		}

		return new PageRequest(pageNumber - 1, pagzSize, sort);
	}

	/**
	 * 创建动态查询条件组合.
	 */
	private Specification<BasDict> buildSpecification(Map<String, Object> searchParams) {
		Map<String, SearchFilter> filters = SearchFilter.parse(searchParams);
		Specification<BasDict> spec = DynamicSpecifications.bySearchFilter(filters.values(), BasDict.class);
		return spec;
	}

	@Autowired
	public void setDictDao(BasDictDao dictDao) {
		this.dictDao = dictDao;
	}
}
