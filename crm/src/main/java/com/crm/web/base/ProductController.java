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

import com.crm.entiry.Product;
import com.crm.service.base.ProductService;

/**
 * 管理员管理用户的Controller.
 * 
 * @author calvin
 */
@Controller
@RequestMapping(value = "/base/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping(method = RequestMethod.GET)
	public String list(Model model) {
		List<Product> products = productService.getAll();
		model.addAttribute("products", products);

		return "base/productList";
	}

	@RequestMapping(value = "create", method = RequestMethod.GET)
	public String registerForm() {
		return "base/productForm";
	}

	@RequestMapping(value = "update/{id}", method = RequestMethod.GET)
	public String updateForm(@PathVariable("id") Long id, Model model) {
		model.addAttribute("plan", productService.get(id));
		return "base/productForm";
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(@Valid @ModelAttribute("plan") Product product, RedirectAttributes redirectAttributes) {
		if (product.getId() == null) {
			productService.create(product);
			redirectAttributes.addFlashAttribute("message", "创建产品信息记录" + product.getId() + "成功");
		} else {
			productService.update(product);
			redirectAttributes.addFlashAttribute("message", "更新产品信息记录" + product.getId() + "成功");
		}
		return "redirect:/base/product";
	}

	@RequestMapping(value = "delete/{id}")
	public String delete(@PathVariable("id") Long id, RedirectAttributes redirectAttributes) {
		Product plan = productService.get(id);
		productService.delete(id);
		redirectAttributes.addFlashAttribute("message", "删除产品信息记录" + plan.getId() + "成功");
		return "redirect:/base/product";
	}

	/**
	 * 所有RequestMapping方法调用前的Model准备方法, 实现Struts2 Preparable二次部分绑定的效果,先根据form的id从数据库查出User对象,再把Form提交的内容绑定到该对象上。
	 * 因为仅update()方法的form中有id属性，因此仅在update时实际执行.
	 */
	@ModelAttribute
	public void getSalPlan(@RequestParam(value = "id", defaultValue = "-1") Long id, Model model) {
		if (id != -1) {
			model.addAttribute("product", productService.get(id));
		}
	}
}
