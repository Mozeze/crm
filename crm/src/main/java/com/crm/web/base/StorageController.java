package com.crm.web.base;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.crm.entiry.Storage;
import com.crm.service.base.StorageService;

/**
 * 管理员管理用户的Controller.
 * 
 * @author calvin
 */
@Controller
@RequestMapping(value = "/base/storage")
public class StorageController {

	@Autowired
	private StorageService storageService;

	@RequestMapping(method = RequestMethod.GET)
	public String list(Model model) {
		List<Storage> storages = storageService.getAll();
		model.addAttribute("storages", storages);

		return "base/storageList";
	}

	@RequestMapping(value = "create", method = RequestMethod.GET)
	public String registerForm() {
		return "base/storageForm";
	}

	@RequestMapping(value = "update/{id}", method = RequestMethod.GET)
	public String updateForm(@PathVariable("id") Long id, Model model) {
		model.addAttribute("plan", storageService.get(id));
		return "base/storageForm";
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(@Valid @ModelAttribute("plan") Storage storage, RedirectAttributes redirectAttributes) {
		if (storage.getId() == null) {
			storageService.create(storage);
			redirectAttributes.addFlashAttribute("message", "创建库存记录" + storage.getId() + "成功");
		} else {
			storageService.update(storage);
			redirectAttributes.addFlashAttribute("message", "更新库存记录" + storage.getId() + "成功");
		}
		return "redirect:/base/storage";
	}

	@RequestMapping(value = "delete/{id}")
	public String delete(@PathVariable("id") Long id, RedirectAttributes redirectAttributes) {
		Storage plan = storageService.get(id);
		storageService.delete(id);
		redirectAttributes.addFlashAttribute("message", "删除库存记录" + plan.getId() + "成功");
		return "redirect:/base/storage";
	}

	/**
	 * 所有RequestMapping方法调用前的Model准备方法, 实现Struts2 Preparable二次部分绑定的效果,先根据form的id从数据库查出User对象,再把Form提交的内容绑定到该对象上。
	 * 因为仅update()方法的form中有id属性，因此仅在update时实际执行.
	 */
	@ModelAttribute
	public void getSalPlan(@RequestParam(value = "id", defaultValue = "-1") Long id, Model model) {
		if (id != -1) {
			model.addAttribute("storage", storageService.get(id));
		}
	}
}
