package com.sideboy.blog.controller.admin;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sideboy.blog.service.CommentService;
import com.sideboy.blog.util.PageQueryUtil;
import com.sideboy.blog.util.Result;
import com.sideboy.blog.util.ResultGenerator;

@Controller
@RequestMapping("/admin")
public class CommentController {

	@Resource
	private CommentService commentService;

	@GetMapping("/comments/list")
	@ResponseBody
	public Result list(@RequestParam Map<String, Object> params) {
		if (StringUtils.isEmpty(params.get("page")) || StringUtils.isEmpty(params.get("limit"))) {
			return ResultGenerator.genFailResult("参数异常！");
		}
		PageQueryUtil pageUtil = new PageQueryUtil(params);
		return ResultGenerator.genSuccessResult(commentService.getCommentsPage(pageUtil));
	}

	@PostMapping("/comments/checkDone")
	@ResponseBody
	public Result checkDone(@RequestBody Integer[] ids) {
		if (ids.length < 1) {
			return ResultGenerator.genFailResult("参数异常！");
		}
		if (commentService.checkDone(ids)) {
			return ResultGenerator.genSuccessResult();
		} else {
			return ResultGenerator.genFailResult("审核失败");
		}
	}

	@PostMapping("/comments/reply")
	@ResponseBody
	public Result checkDone(@RequestParam("commentId") Long commentId, @RequestParam("replyBody") String replyBody) {
		if (commentId == null || commentId < 1 || StringUtils.isEmpty(replyBody)) {
			return ResultGenerator.genFailResult("参数异常！");
		}
		if (commentService.reply(commentId, replyBody)) {
			return ResultGenerator.genSuccessResult();
		} else {
			return ResultGenerator.genFailResult("回复失败");
		}
	}

	@PostMapping("/comments/delete")
	@ResponseBody
	public Result delete(@RequestBody Integer[] ids) {
		if (ids.length < 1) {
			return ResultGenerator.genFailResult("参数异常！");
		}
		if (commentService.deleteBatch(ids)) {
			return ResultGenerator.genSuccessResult();
		} else {
			return ResultGenerator.genFailResult("刪除失败");
		}
	}

	@GetMapping("/comments")
	public String list(HttpServletRequest request) {
		request.setAttribute("path", "comments");
		return "admin/comment";
	}

}
