package com.sideboy.blog.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 博客文章信息实体类。
 * 
 * @author qinbiao
 *
 */
public class Blog {

	private Long blogId; // 博客ID
	private String blogTitle; // 博客标题
	private String blogSubUrl;
	private String blogCoverImage;
	private Integer blogCategoryId;
	private String blogCategoryName;
	private String blogTags;
	private Byte blogStatus;
	private Long blogViews;
	private Byte enableComment;
	private Byte isDeleted;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;
//	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date updateTime;
	private String blogContent;

	public Blog(Long blogId, String blogTitle, String blogSubUrl, String blogCoverImage, Integer blogCategoryId,
			String blogCategoryName, String blogTags, Byte blogStatus, Long blogViews, Byte enableComment,
			Byte isDeleted, Date createTime, Date updateTime, String blogContent) {
		super();
		this.blogId = blogId;
		this.blogTitle = blogTitle;
		this.blogSubUrl = blogSubUrl;
		this.blogCoverImage = blogCoverImage;
		this.blogCategoryId = blogCategoryId;
		this.blogCategoryName = blogCategoryName;
		this.blogTags = blogTags;
		this.blogStatus = blogStatus;
		this.blogViews = blogViews;
		this.enableComment = enableComment;
		this.isDeleted = isDeleted;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.blogContent = blogContent;
	}

	public Blog() {
	}

	public Long getBlogId() {
		return blogId;
	}

	public void setBlogId(Long blogId) {
		this.blogId = blogId;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle == null ? null : blogTitle.trim();
	}

	public String getBlogSubUrl() {
		return blogSubUrl;
	}

	public void setBlogSubUrl(String blogSubUrl) {
		this.blogSubUrl = blogSubUrl == null ? null : blogSubUrl.trim();
	}

	public String getBlogCoverImage() {
		return blogCoverImage;
	}

	public void setBlogCoverImage(String blogCoverImage) {
		this.blogCoverImage = blogCoverImage == null ? null : blogCoverImage.trim();
	}

	public Integer getBlogCategoryId() {
		return blogCategoryId;
	}

	public void setBlogCategoryId(Integer blogCategoryId) {
		this.blogCategoryId = blogCategoryId;
	}

	public String getBlogCategoryName() {
		return blogCategoryName;
	}

	public void setBlogCategoryName(String blogCategoryName) {
		this.blogCategoryName = blogCategoryName == null ? null : blogCategoryName.trim();
	}

	public String getBlogTags() {
		return blogTags;
	}

	public void setBlogTags(String blogTags) {
		this.blogTags = blogTags == null ? null : blogTags.trim();
	}

	public Byte getBlogStatus() {
		return blogStatus;
	}

	public void setBlogStatus(Byte blogStatus) {
		this.blogStatus = blogStatus;
	}

	public Long getBlogViews() {
		return blogViews;
	}

	public void setBlogViews(Long blogViews) {
		this.blogViews = blogViews;
	}

	public Byte getEnableComment() {
		return enableComment;
	}

	public void setEnableComment(Byte enableComment) {
		this.enableComment = enableComment;
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

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getBlogContent() {
		return blogContent;
	}

	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent == null ? null : blogContent.trim();
	}

	@Override
	public String toString() {
		return "Blog [blogId=" + blogId + ", blogTitle=" + blogTitle + ", blogSubUrl=" + blogSubUrl
				+ ", blogCoverImage=" + blogCoverImage + ", blogCategoryId=" + blogCategoryId + ", blogCategoryName="
				+ blogCategoryName + ", blogTags=" + blogTags + ", blogStatus=" + blogStatus + ", blogViews="
				+ blogViews + ", enableComment=" + enableComment + ", isDeleted=" + isDeleted + ", createTime="
				+ createTime + ", updateTime=" + updateTime + ", blogContent=" + blogContent + "]";
	}

}
