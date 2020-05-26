package com.sideboy.blog.entity;

public class BlogTagCount {

	private Integer tagId;
	private String tagName;
	private Integer tagCount;

	public BlogTagCount() {
	}

	public BlogTagCount(Integer tagId, String tagName, Integer tagCount) {
		super();
		this.tagId = tagId;
		this.tagName = tagName == null ? null : tagName.trim();
		this.tagCount = tagCount;
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

	public Integer getTagCount() {
		return tagCount;
	}

	public void setTagCount(Integer tagCount) {
		this.tagCount = tagCount;
	}

	@Override
	public String toString() {
		return "BlogTagCount [tagId=" + tagId + ", tagName=" + tagName + ", tagCount=" + tagCount + "]";
	}


}
