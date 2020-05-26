package com.sideboy.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sideboy.blog.entity.BlogTagRelation;

public interface BlogTagRelationMapper {

	int deleteByPrimaryKey(Long relationId);

	int insert(BlogTagRelation record);

	int insertSelective(BlogTagRelation record);

	BlogTagRelation selectByPrimaryKey(Long relationId);

	BlogTagRelation selectByBlogIdAndTagId(Long relationId);

	BlogTagRelation selectByBlogIdAndTagId(@Param("blogId") Long blogId, @Param("tagId") Integer tagId);

	List<Long> selectDistinctTagIds(Integer[] tagIds);

	int updateByPrimaryKeySelective(BlogTagRelation record);

	int updateByPrimaryKey(BlogTagRelation record);

	int batchInsert(@Param("relationList") List<BlogTagRelation> blogTagRelationList);

	int deleteByBlogId(Long blogId);
}
