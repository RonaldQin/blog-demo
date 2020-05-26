package com.sideboy.blog.service;

import java.util.List;
import java.util.Map;

import com.sideboy.blog.entity.BlogLink;
import com.sideboy.blog.util.PageQueryUtil;
import com.sideboy.blog.util.PageResult;

public interface LinkService {

	/**
	 * 查询友链的分页数据
	 * 
	 * @param pageUtil
	 * @return
	 */
	PageResult getBlogLinkPage(PageQueryUtil pageUtil);

	int getTotalLinks();

	Boolean saveLink(BlogLink link);

	BlogLink selectById(Integer id);

	Boolean updateLink(BlogLink tempLink);

	Boolean deleteBatch(Integer[] ids);

	/**
	 * 返回友链页面所需的所有数据
	 * 
	 * @return
	 */
	Map<Byte, List<BlogLink>> getLinksForLinkPage();
}
