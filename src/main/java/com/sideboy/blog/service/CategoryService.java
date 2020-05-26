package com.sideboy.blog.service;

import java.util.List;

import com.sideboy.blog.entity.BlogCategory;
import com.sideboy.blog.util.PageQueryUtil;
import com.sideboy.blog.util.PageResult;

public interface CategoryService {

	PageResult getBlogCategoryPage(PageQueryUtil pageUtil);

	int getTotalCategories();

	Boolean saveCategory(String categoryName, String categoryIcon);

	Boolean updateCategory(Integer categoryId, String categoryName, String categoryIcon);

	Boolean deleteBatch(Integer[] ids);

	List<BlogCategory> getAllCategories();
}
