package com.sideboy.blog.dao;

import java.util.List;

import com.sideboy.blog.entity.BlogTag;
import com.sideboy.blog.entity.BlogTagCount;
import com.sideboy.blog.util.PageQueryUtil;

public interface BlogTagMapper {
	int deleteByPrimaryKey(Integer tagId);

	int insert(BlogTag record);

	int insertSelective(BlogTag record);

	BlogTag selectByPrimaryKey(Integer tagId);

	BlogTag selectByTagName(String tagName);

	int updateByPrimaryKeySelective(BlogTag record);

	int updateByPrimaryKey(BlogTag record);

	List<BlogTag> findTagList(PageQueryUtil pageUtil);

	List<BlogTagCount> getTagCount();

	int getTotalTags(PageQueryUtil pageUtil);

	int deleteBatch(Integer[] ids);

	int batchInsertBlogTag(List<BlogTag> tagList);
}
