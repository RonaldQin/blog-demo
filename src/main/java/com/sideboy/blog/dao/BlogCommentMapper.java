package com.sideboy.blog.dao;

import java.util.List;
import java.util.Map;

import com.sideboy.blog.entity.BlogComment;

public interface BlogCommentMapper {
	int deleteByPrimaryKey(Long commentId);

	int insert(BlogComment record);

	int insertSelective(BlogComment record);

	BlogComment selectByPrimaryKey(Long commentId);

	int updateByPrimaryKeySelective(BlogComment record);

	int updateByPrimaryKey(BlogComment record);

	List<BlogComment> findBlogCommentList(Map map);

	int getTotalBlogComments(Map map);

	int checkDone(Integer[] ids);

	int deleteBatch(Integer[] ids);
}
