package com.sideboy.blog.dao;

import java.util.List;

import com.sideboy.blog.entity.BlogConfig;

public interface BlogConfigMapper {
	List<BlogConfig> selectAll();

	BlogConfig selectByPrimaryKey(String configName);

	int updateByPrimaryKeySelective(BlogConfig record);
}
