package com.crm.web.base;

import java.util.List;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springside.modules.web.Servlets;

import com.crm.entiry.BasDict;
import com.crm.service.base.BasDictService;
import com.google.common.collect.Maps;

/**
 * 管理员管理用户的Controller.
 * Dict管理的Controller, 使用Restful风格的Urls:
 * 
 * List page : 		GET 	/base/dict/
 * Create page : 	GET 	/base/dict/create
 * Create action : 	POST 	/base/dict/create
 * Update page : 	GET 	/base/dict/update/{id}
 * Update action : 	POST 	/base/dict/update
 * Delete action : 	GET 	/base/dict/delete/{id}
 * @author calvin
 */
@Controller
@RequestMapping(value = "/base/dict")
public class BasDictController {
	private static final String PAGE_SIZE = "5";
	private static Map<String, String> sortTypes = Maps.newLinkedHashMap();
	static {
		sortTypes.put("auto", "自动");
		sortTypes.put("dictType", "类别");
		sortTypes.put("dictItem", "条目");
		sortTypes.put("dictValue", "值");
	}

	@Autowired
	private BasDictService dictService;

	@RequestMapping(method = RequestMethod.GET)
	public String list(@RequestParam(value = "page", defaultValue = "1") int pageNumber, @RequestParam(value = "page.size", defaultValue = PAGE_SIZE) int pageSize,
			@RequestParam(value = "sortType", defaultValue = "auto") String sortType, Model model, ServletRequest request) {
		Map<String, Object> searchParams = Servlets.getParametersStartingWith(request, "search_");
		Page<BasDict> dicts = dictService.getBasDict(searchParams, pageNumber, pageSize, sortType);

		model.addAttribute("dicts", dicts);
		model.addAttribute("sortType", sortType);
		model.addAttribute("sortTypes", sortTypes);
		// 将搜索条件编码成字符串，用于排序，分页的URL
		model.addAttribute("searchParams", Servlets.encodeParameterStringWithPrefix(searchParams, "search_"));

		return "base/dictList";
	}

	@RequestMapping(value = "create", method = RequestMethod.GET)
	public String createForm(Model model) {
		Long maxDictId = dictService.getMaxDictId();
		if (maxDictId == null)
			maxDictId = 1L;
		else
			maxDictId = maxDictId + 1;
		model.addAttribute("dictId", maxDictId);
		return "base/dictForm";
	}

	@RequestMapping(value = "update/{id}", method = RequestMethod.GET)
	public String updateForm(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dict", dictService.get(id));
		return "base/dictForm";
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(@Valid @ModelAttribute("plan") BasDict dict, RedirectAttributes redirectAttributes) {
		if (dict.getId() == null) {
			dictService.create(dict);
			redirectAttributes.addFlashAttribute("message", "创建数据字典记录" + dict.getDictId() + "成功");
		} else {
			dictService.update(dict);
			redirectAttributes.addFlashAttribute("message", "更新数据字典记录" + dict.getDictId() + "成功");
		}
		return "redirect:/base/dict";
	}

	@RequestMapping(value = "delete/{id}")
	public String delete(@PathVariable("id") Long id, RedirectAttributes redirectAttributes) {
		BasDict plan = dictService.get(id);
		dictService.delete(id);
		redirectAttributes.addFlashAttribute("message", "删除数据字典记录" + plan.getDictId() + "成功");
		return "redirect:/base/dict";
	}

	/**
	 * 所有RequestMapping方法调用前的Model准备方法, 实现Struts2 Preparable二次部分绑定的效果,先根据form的id从数据库查出User对象,再把Form提交的内容绑定到该对象上。
	 * 因为仅update()方法的form中有id属性，因此仅在update时实际执行.
	 */
	@ModelAttribute
	public void getSalPlan(@RequestParam(value = "id", defaultValue = "-1") Long id, Model model) {
		if (id != -1) {
			model.addAttribute("dict", dictService.get(id));
		}
	}
}
