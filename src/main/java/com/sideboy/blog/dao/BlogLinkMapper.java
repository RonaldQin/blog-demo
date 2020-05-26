package com.sideboy.blog.dao;

import java.util.List;

import com.sideboy.blog.entity.BlogLink;
import com.sideboy.blog.util.PageQueryUtil;

public interface BlogLinkMapper {

	int deleteByPrimaryKey(Integer linkId);

	int insert(BlogLink record);

	int insertSelective(BlogLink record);

	BlogLink selectByPrimaryKey(Integer linkId);

	int updateByPrimaryKeySelective(BlogLink record);

	int updateByPrimaryKey(BlogLink record);

	List<BlogLink> findLinkList(PageQueryUtil pageUtil);

	int getTotalLinks(PageQueryUtil pageUtil);

	int deleteBatch(Integer[] ids);
}
