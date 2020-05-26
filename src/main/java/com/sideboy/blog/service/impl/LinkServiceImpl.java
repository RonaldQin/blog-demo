package com.sideboy.blog.service.impl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import com.sideboy.blog.dao.BlogLinkMapper;
import com.sideboy.blog.entity.BlogLink;
import com.sideboy.blog.service.LinkService;
import com.sideboy.blog.util.PageQueryUtil;
import com.sideboy.blog.util.PageResult;

public class LinkServiceImpl implements LinkService {

	@Autowired
	private BlogLinkMapper blogLinkMapper;

	@Override
	public PageResult getBlogLinkPage(PageQueryUtil pageUtil) {
		List<BlogLink> links = blogLinkMapper.findLinkList(pageUtil);
		int total = blogLinkMapper.getTotalLinks(pageUtil);
		PageResult pageResult = new PageResult(links, total, pageUtil.getLimit(), pageUtil.getPage());
		return pageResult;
	}

	@Override
	public int getTotalLinks() {
		return blogLinkMapper.getTotalLinks(null);
	}

	@Override
	public Boolean saveLink(BlogLink link) {
		return blogLinkMapper.insertSelective(link) > 0;
	}

	@Override
	public BlogLink selectById(Integer id) {
		return blogLinkMapper.selectByPrimaryKey(id);
	}

	@Override
	public Boolean updateLink(BlogLink tempLink) {
		return blogLinkMapper.updateByPrimaryKeySelective(tempLink) > 0;
	}

	@Override
	public Boolean deleteBatch(Integer[] ids) {
		return blogLinkMapper.deleteBatch(ids) > 0;
	}

	@Override
	public Map<Byte, List<BlogLink>> getLinksForLinkPage() {
		// 获取所有链接数据
		List<BlogLink> links = blogLinkMapper.findLinkList(null);
		if (!CollectionUtils.isEmpty(links)) {
			// 根据type进行分组
			Map<Byte, List<BlogLink>> linksMap = links.stream().collect(Collectors.groupingBy(BlogLink::getLinkType));
			return linksMap;
		}
		return null;
	}
}
