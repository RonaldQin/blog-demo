package com.sideboy.blog.controller.admin;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sideboy.blog.entity.BlogLink;
import com.sideboy.blog.service.LinkService;
import com.sideboy.blog.util.PageQueryUtil;
import com.sideboy.blog.util.Result;
import com.sideboy.blog.util.ResultGenerator;

@Controller
@RequestMapping("/admin")
public class LinkController {

	@Resource
	private LinkService linkService;

	@GetMapping("/links")
	public String linkPage(HttpServletRequest request) {
		request.setAttribute("path", "links");
		return "admin/link";
	}

	@GetMapping("/links/list")
	@ResponseBody
	public Result list(@RequestParam Map<String, Object> params) {
		if (StringUtils.isEmpty(params.get("page")) || StringUtils.isEmpty(params.get("limit"))) {
			return ResultGenerator.genFailResult("参数异常！");
		}
		PageQueryUtil pageUtil = new PageQueryUtil(params);
		return ResultGenerator.genSuccessResult(linkService.getBlogLinkPage(pageUtil));
	}

	/**
	 * 友链添加
	 */
	@RequestMapping(value = "/links/save", method = RequestMethod.POST)
	@ResponseBody
	public Result save(@RequestParam("linkType") Integer linkType, @RequestParam("linkName") String linkName,
			@RequestParam("linkUrl") String linkUrl, @RequestParam("linkRank") Integer linkRank,
			@RequestParam("linkDescription") String linkDescription) {
		if (linkType == null || linkType < 0 || linkRank == null || linkRank < 0 || StringUtils.isEmpty(linkName)
				|| StringUtils.isEmpty(linkName) || StringUtils.isEmpty(linkUrl)
				|| StringUtils.isEmpty(linkDescription)) {
			return ResultGenerator.genFailResult("参数异常！");
		}
		BlogLink link = new BlogLink();
		link.setLinkType(linkType.byteValue());
		link.setLinkRank(linkRank);
		link.setLinkName(linkName);
		link.setLinkUrl(linkUrl);
		link.setLinkDescription(linkDescription);
		return ResultGenerator.genSuccessResult(linkService.saveLink(link));
	}

	/**
	 * 详情
	 */
	@GetMapping("/links/info/{id}")
	@ResponseBody
	public Result info(@PathVariable("id") Integer id) {
		BlogLink link = linkService.selectById(id);
		return ResultGenerator.genSuccessResult(link);
	}

	/**
	 * 友链修改
	 */
	@RequestMapping(value = "/links/update", method = RequestMethod.POST)
	@ResponseBody
	public Result update(@RequestParam("linkId") Integer linkId, @RequestParam("linkType") Integer linkType,
			@RequestParam("linkName") String linkName, @RequestParam("linkUrl") String linkUrl,
			@RequestParam("linkRank") Integer linkRank, @RequestParam("linkDescription") String linkDescription) {
		BlogLink tempLink = linkService.selectById(linkId);
		if (tempLink == null) {
			return ResultGenerator.genFailResult("无数据！");
		}
		if (linkType == null || linkType < 0 || linkRank == null || linkRank < 0 || StringUtils.isEmpty(linkName)
				|| StringUtils.isEmpty(linkName) || StringUtils.isEmpty(linkUrl)
				|| StringUtils.isEmpty(linkDescription)) {
			return ResultGenerator.genFailResult("参数异常！");
		}
		tempLink.setLinkType(linkType.byteValue());
		tempLink.setLinkRank(linkRank);
		tempLink.setLinkName(linkName);
		tempLink.setLinkUrl(linkUrl);
		tempLink.setLinkDescription(linkDescription);
		return ResultGenerator.genSuccessResult(linkService.updateLink(tempLink));
	}

	/**
	 * 友链删除
	 */
	@RequestMapping(value = "/links/delete", method = RequestMethod.POST)
	@ResponseBody
	public Result delete(@RequestBody Integer[] ids) {
		if (ids.length < 1) {
			return ResultGenerator.genFailResult("参数异常！");
		}
		if (linkService.deleteBatch(ids)) {
			return ResultGenerator.genSuccessResult();
		} else {
			return ResultGenerator.genFailResult("删除失败");
		}
	}
}
