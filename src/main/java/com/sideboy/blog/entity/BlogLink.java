package com.sideboy.blog.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BlogLink {

	private Integer linkId;
	private Byte linkType;
	private String linkName;
	private String linkUrl;
	private String linkDescription;
	private Integer linkRank;
	private Byte isDeleted;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;

	public BlogLink() {
	}

	public BlogLink(Integer linkId, Byte linkType, String linkName, String linkUrl, String linkDescription,
			Integer linkRank, Byte isDeleted, Date createTime) {
		super();
		this.linkId = linkId;
		this.linkType = linkType;
		this.linkName = linkName;
		this.linkUrl = linkUrl;
		this.linkDescription = linkDescription;
		this.linkRank = linkRank;
		this.isDeleted = isDeleted;
		this.createTime = createTime;
	}


	public Integer getLinkId() {
		return linkId;
	}

	public void setLinkId(Integer linkId) {
		this.linkId = linkId;
	}


	public Byte getLinkType() {
		return linkType;
	}

	public void setLinkType(Byte linkType) {
		this.linkType = linkType;
	}

	public String getLinkName() {
		return linkName;
	}

	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}

	public String getLinkUrl() {
		return linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getLinkDescription() {
		return linkDescription;
	}

	public void setLinkDescription(String linkDescription) {
		this.linkDescription = linkDescription;
	}

	public Integer getLinkRank() {
		return linkRank;
	}

	public void setLinkRank(Integer linkRank) {
		this.linkRank = linkRank;
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
		return "BlogLink [linkId=" + linkId + ", linkType=" + linkType + ", linkName=" + linkName + ", linkUrl="
				+ linkUrl + ", linkDescription=" + linkDescription + ", linkRank=" + linkRank + ", isDeleted="
				+ isDeleted + ", createTime=" + createTime + "]";
	}


}
