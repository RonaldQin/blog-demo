package com.sideboy.blog.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 文章标签信息实体类。
 * 
 * @author qinbiao
 *
 */
public class BlogTag {

	private Integer tagId; // 标签ID
	private String tagName; // 标签名
	private Byte isDeleted;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;

	public BlogTag() {
	}

	public BlogTag(Integer tagId, String tagName, Byte isDeleted, Date createTime) {
		super();
		this.tagId = tagId;
		this.tagName = tagName == null ? null : tagName.trim();
		this.isDeleted = isDeleted;
		this.createTime = createTime;
	}

	public Integer getTagId() {
		return tagId;
	}

	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName == null ? null : tagName.trim();
	}

	public Byte getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Byte isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "BlogTag [tagId=" + tagId + ", tagName=" + tagName + ", isDeleted=" + isDeleted + ", createTime="
				+ createTime + "]";
	}

}
