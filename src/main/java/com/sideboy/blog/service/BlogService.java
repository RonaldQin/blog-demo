package com.sideboy.blog.service;

import java.util.List;

import com.sideboy.blog.controller.vo.BlogDetailVO;
import com.sideboy.blog.controller.vo.SimpleBlogListVO;
import com.sideboy.blog.entity.Blog;
import com.sideboy.blog.util.PageQueryUtil;
import com.sideboy.blog.util.PageResult;

public interface BlogService {
	String saveBlog(Blog blog);

	PageResult getBlogsPage(PageQueryUtil pageUtil);

	Boolean deleteBatch(Integer[] ids);

	int getTotalBlogs();

	/**
	 * 根据id获取详情
	 * 
	 * @param blogId
	 * @return
	 */
	Blog getBlogById(Long blogId);

	/**
	 * 后台修改
	 * 
	 * @param blog
	 * @return
	 */
	String updateBlog(Blog blog);

	/**
	 * 获取首页文章列表
	 * 
	 * @param page
	 * @return
	 */
	PageResult getBlogsForIndexPage(int page);

	/**
	 * 首页侧边栏数据列表
	 * 
	 * @param type
	 * @return
	 */
	List<SimpleBlogListVO> getBlogListForIndexPage(int type);

	/**
	 * 文章详情
	 * 
	 * @param blogId
	 * @return
	 */
	BlogDetailVO getBlogDetail(Long blogId);

	/**
	 * 根据标签取文章列表
	 * 
	 * @param tagName
	 * @param page
	 * @return
	 */
	PageResult getBlogsPageByTag(String tagName, int page);

	/**
	 * 根据分类获取文章列表
	 * 
	 * @param categoryId
	 * @param page
	 * @return
	 */
	PageResult getBlogsPageByCategory(String categoryId, int page);

	/**
	 * 根据搜索获取文章列表
	 * 
	 * @param keyword
	 * @param page
	 * @return
	 */
	PageResult getBlogsPageBySearch(String keyword, int page);

	BlogDetailVO getBlogDetailBySubUrl(String subUrl);
}

