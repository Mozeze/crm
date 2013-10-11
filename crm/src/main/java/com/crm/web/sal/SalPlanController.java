package com.crm.web.sal;

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

import com.crm.entiry.SalPlan;
import com.crm.service.sal.SalPlanService;

/**
 * 管理员管理用户的Controller.
 * 
 * @author calvin
 */
@Controller
@RequestMapping(value = "/sal/plan")
public class SalPlanController {

	@Autowired
	private SalPlanService planService;

	@RequestMapping(method = RequestMethod.GET)
	public String list(Model model) {
		List<SalPlan> plans = planService.getAll();
		model.addAttribute("plans", plans);

		return "sal/planList";
	}

	@RequestMapping(value = "create", method = RequestMethod.GET)
	public String registerForm() {
		return "sal/planForm";
	}

	@RequestMapping(value = "update/{id}", method = RequestMethod.GET)
	public String updateForm(@PathVariable("id") Long id, Model model) {
		model.addAttribute("plan", planService.get(id));
		return "sal/planForm";
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(@Valid @ModelAttribute("plan") SalPlan plan, RedirectAttributes redirectAttributes) {
		if (plan.getPlaId() == null) {
			planService.create(plan);
		}
		planService.update(plan);
		redirectAttributes.addFlashAttribute("message", "更新or创建SalPlan" + plan.getPlaId() + "成功");
		return "redirect:/sal/plan";
	}

	@RequestMapping(value = "delete/{id}")
	public String delete(@PathVariable("id") Long id, RedirectAttributes redirectAttributes) {
		SalPlan plan = planService.get(id);
		planService.delete(id);
		redirectAttributes.addFlashAttribute("message", "删除SalPlan" + plan.getPlaId() + "成功");
		return "redirect:/sal/plan";
	}

	/**
	 * 所有RequestMapping方法调用前的Model准备方法, 实现Struts2 Preparable二次部分绑定的效果,先根据form的id从数据库查出User对象,再把Form提交的内容绑定到该对象上。
	 * 因为仅update()方法的form中有id属性，因此仅在update时实际执行.
	 */
	@ModelAttribute
	public void getSalPlan(@RequestParam(value = "plaId", defaultValue = "-1") Long id, Model model) {
		if (id != -1) {
			model.addAttribute("plan", planService.get(id));
		}
	}
}
