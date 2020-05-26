package com.sideboy.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sideboy.blog.entity.BlogCategory;
import com.sideboy.blog.util.PageQueryUtil;

public interface BlogCategoryMapper {

	int deleteByPrimaryKey(Integer categoryId);

	int insert(BlogCategory record);

	int insertSelective(BlogCategory record);

	BlogCategory selectByPrimaryKey(Integer categoryId);

	BlogCategory selectByCategoryName(String categoryName); // TODO: 这里应该有问题吧？！

	int updateByPrimaryKeySelective(BlogCategory record);

	int updateByPrimaryKey(BlogCategory record);

	List<BlogCategory> findCategoryList(PageQueryUtil pageUtil);

	List<BlogCategory> selectByCategoryIds(@Param("categoryIds") List<Integer> categoryIds);

	int getTotalCategories(PageQueryUtil pageUtil); // select count(*) from tb_blog_category where is_deleted=0

	int deleteBatch(Integer[] ids);

}
