package com.sideboy.blog.entity;

import java.util.Date;

public class BlogTagRelation {

	private Long relationId;
	private Long blogId;
	private Integer tagId;
	private Date createTime;

	public BlogTagRelation() {
	}

	public BlogTagRelation(Long relationId, Long blogId, Integer tagId, Date createTime) {
		super();
		this.relationId = relationId;
		this.blogId = blogId;
		this.tagId = tagId;
		this.createTime = createTime;
	}

	public Long getRelationId() {
		return relationId;
	}

	public void setRelationId(Long relationId) {
		this.relationId = relationId;
	}

	public Long getBlogId() {
		return blogId;
	}

	public void setBlogId(Long blogId) {
		this.blogId = blogId;
	}

	public Integer getTagId() {
		return tagId;
	}

	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "BlogTagRelation [relationId=" + relationId + ", blogId=" + blogId + ", tagId=" + tagId + ", createTime="
				+ createTime + "]";
	}

}
