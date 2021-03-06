package com.sideboy.blog.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 博客评论信息实体类。
 * 
 * @author qinbiao
 *
 */
public class BlogComment {

	private Long commentId;
	private Long blogId;
	private String commentator;
	private String email;
	private String websiteUrl;
	private String commentBody;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date commentCreateTime;
	private String commentatorIp;
	private String replyBody;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date replyCreateTime;
	private Byte commentStatus;
	private Byte isDeleted;

	public BlogComment() {
	}

	public BlogComment(Long commentId, Long blogId, String commentator, String email, String websiteUrl,
			String commentBody, Date commentCreateTime, String commentatorIp, String replyBody, Date replyCreateTime,
			Byte commentStatus, Byte isDeleted) {
		super();
		this.commentId = commentId;
		this.blogId = blogId;
		this.commentator = commentator;
		this.email = email;
		this.websiteUrl = websiteUrl;
		this.commentBody = commentBody;
		this.commentCreateTime = commentCreateTime;
		this.commentatorIp = commentatorIp;
		this.replyBody = replyBody;
		this.replyCreateTime = replyCreateTime;
		this.commentStatus = commentStatus;
		this.isDeleted = isDeleted;
	}

	public Long getCommentId() {
		return commentId;
	}

	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}

	public Long getBlogId() {
		return blogId;
	}

	public void setBlogId(Long blogId) {
		this.blogId = blogId;
	}

	public String getCommentator() {
		return commentator;
	}

	public void setCommentator(String commentator) {
		this.commentator = commentator == null ? null : commentator.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getWebsiteUrl() {
		return websiteUrl;
	}

	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl == null ? null : websiteUrl.trim();
	}

	public String getCommentBody() {
		return commentBody;
	}

	public void setCommentBody(String commentBody) {
		this.commentBody = commentBody == null ? null : commentBody.trim();
	}

	public Date getCommentCreateTime() {
		return commentCreateTime;
	}

	public void setCommentCreateTime(Date commentCreateTime) {
		this.commentCreateTime = commentCreateTime;
	}

	public String getCommentatorIp() {
		return commentatorIp;
	}

	public void setCommentatorIp(String commentatorIp) {
		this.commentatorIp = commentatorIp == null ? null : commentatorIp.trim();
	}

	public String getReplyBody() {
		return replyBody;
	}

	public void setReplyBody(String replyBody) {
		this.replyBody = replyBody == null ? null : replyBody.trim();
	}

	public Date getReplyCreateTime() {
		return replyCreateTime;
	}

	public void setReplyCreateTime(Date replyCreateTime) {
		this.replyCreateTime = replyCreateTime;
	}

	public Byte getCommentStatus() {
		return commentStatus;
	}

	public void setCommentStatus(Byte commentStatus) {
		this.commentStatus = commentStatus;
	}

	public Byte getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Byte isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Override
	public String toString() {
		return "BlogComment [commentId=" + commentId + ", blogId=" + blogId + ", commentator=" + commentator
				+ ", email=" + email + ", websiteUrl=" + websiteUrl + ", commentBody=" + commentBody
				+ ", commentCreateTime=" + commentCreateTime + ", commentatorIp=" + commentatorIp + ", replyBody="
				+ replyBody + ", replyCreateTime=" + replyCreateTime + ", commentStatus=" + commentStatus
				+ ", isDeleted=" + isDeleted + "]";
	}

}
