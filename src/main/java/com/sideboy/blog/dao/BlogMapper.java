package com.sideboy.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sideboy.blog.entity.Blog;
import com.sideboy.blog.util.PageQueryUtil;

public interface BlogMapper {

	int deleteByPrimaryKey(Long blogId);

	int insert(Blog record);

	int insertSelective(Blog record);

	Blog selectByPrimaryKey(Long blogId);

	int updateByPrimaryKeySelective(Blog record);

	int updateByPrimaryKeyWithBLOGs(Blog record);

	int updateByPrimaryKey(Blog record);

	List<Blog> findBlogList(PageQueryUtil pageUtil);

	List<Blog> findBlogListByType(@Param("type") int type, @Param("limit") int limit);

	int getTotalBlogs(PageQueryUtil pageUtil);

	int deleteBatch(Integer[] ids);

	List<Blog> getBlogsPageByTagId(PageQueryUtil pageUtil);

	int getTotalBlogsByTagId(PageQueryUtil pageUtil);

	Blog selectBySubUrl(String subUrl);

	int updateBlogCategorys(@Param("categoryName") String categoryName, @Param("categoryId") Integer categoryId,
			@Param("ids") Integer[] ids);
}
