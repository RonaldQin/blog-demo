package com.sideboy.blog.service;

import java.util.List;

import com.sideboy.blog.entity.BlogTagCount;
import com.sideboy.blog.util.PageQueryUtil;
import com.sideboy.blog.util.PageResult;

public interface TagService {

	/**
	 * 查询标签的分页数据
	 * 
	 * @param pageUtil
	 * @return
	 */
	PageResult getBlogTagPage(PageQueryUtil pageUtil);

	int getTotalTags();

	Boolean saveTag(String tagname);

	Boolean deleteBatch(Integer[] ids);

	List<BlogTagCount> getBlogTagCountForIndex();
}
