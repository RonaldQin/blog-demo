package com.sideboy.blog.controller.admin;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sideboy.blog.service.CategoryService;
import com.sideboy.blog.util.PageQueryUtil;
import com.sideboy.blog.util.Result;
import com.sideboy.blog.util.ResultGenerator;

@Controller
@RequestMapping("/admin")
public class CategoryController {

	@Resource
	private CategoryService categoryService;

	@GetMapping("/categories")
	public String categoryPage(HttpServletRequest request) {
		request.setAttribute("path", "categories");
		return "admin/category";
	}

	/**
	 * 分类列表
	 */
	@RequestMapping(value = "/categories/list", method = RequestMethod.GET)
	@ResponseBody
	public Result list(@RequestParam Map<String, Object> params) {
		if (StringUtils.isEmpty(params.get("page")) || StringUtils.isEmpty(params.get("limit"))) {
			return ResultGenerator.genFailResult("参数异常！");
		}
		PageQueryUtil pageUtil = new PageQueryUtil(params);
		return ResultGenerator.genSuccessResult(categoryService.getBlogCategoryPage(pageUtil));
	}

	/**
	 * 分类添加
	 */
	@RequestMapping(value = "/categories/save", method = RequestMethod.POST)
	@ResponseBody
	public Result save(@RequestParam("categoryName") String categoryName,
			@RequestParam("categoryIcon") String categoryIcon) {
		if (StringUtils.isEmpty(categoryName)) {
			return ResultGenerator.genFailResult("请输入分类名称！");
		}
		if (StringUtils.isEmpty(categoryIcon)) {
			return ResultGenerator.genFailResult("请选择分类图标！");
		}
		if (categoryService.saveCategory(categoryName, categoryIcon)) {
			return ResultGenerator.genSuccessResult();
		} else {
			return ResultGenerator.genFailResult("分类名称重复");
		}
	}

	/**
	 * 分类修改
	 */
	@RequestMapping(value = "/categories/update", method = RequestMethod.POST)
	@ResponseBody
	public Result update(@RequestParam("categoryId") Integer categoryId,
			@RequestParam("categoryName") String categoryName, @RequestParam("categoryIcon") String categoryIcon) {
		if (StringUtils.isEmpty(categoryName)) {
			return ResultGenerator.genFailResult("请输入分类名称！");
		}
		if (StringUtils.isEmpty(categoryIcon)) {
			return ResultGenerator.genFailResult("请选择分类图标！");
		}
		if (categoryService.updateCategory(categoryId, categoryName, categoryIcon)) {
			return ResultGenerator.genSuccessResult();
		} else {
			return ResultGenerator.genFailResult("分类名称重复");
		}
	}

	/**
	 * 分类删除
	 */
	@RequestMapping(value = "/categories/delete", method = RequestMethod.POST)
	@ResponseBody
	public Result delete(@RequestBody Integer[] ids) {
		if (ids.length < 1) {
			return ResultGenerator.genFailResult("参数异常！");
		}
		if (categoryService.deleteBatch(ids)) {
			return ResultGenerator.genSuccessResult();
		} else {
			return ResultGenerator.genFailResult("删除失败");
		}
	}

}
