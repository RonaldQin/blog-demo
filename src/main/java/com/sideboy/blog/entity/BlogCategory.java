package com.sideboy.blog.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 博客分类信息实体类。
 * 
 * @author qinbiao
 *
 */
public class BlogCategory {

	private Integer categoryId;
	private String categoryName;
	private String categoryIcon;
	private Integer categoryRank;
	private Byte isDeleted;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;

	public BlogCategory(Integer categoryId, String categoryName, String categoryIcon, Integer categoryRank,
			Byte isDeleted, Date createTime) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName == null ? null : categoryName;
		this.categoryIcon = categoryIcon == null ? null : categoryIcon;
		this.categoryRank = categoryRank;
		this.isDeleted = isDeleted;
		this.createTime = createTime;
	}

	public BlogCategory() {
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName == null ? null : categoryName;
	}

	public String getCategoryIcon() {
		return categoryIcon;
	}

	public void setCategoryIcon(String categoryIcon) {
		this.categoryIcon = categoryIcon == null ? null : categoryIcon;
	}

	public Integer getCategoryRank() {
		return categoryRank;
	}

	public void setCategoryRank(Integer categoryRank) {
		this.categoryRank = categoryRank;
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
		return "BlogCategory [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryIcon="
				+ categoryIcon + ", categoryRank=" + categoryRank + ", isDeleted=" + isDeleted + ", createTime="
				+ createTime + "]";
	}

}
