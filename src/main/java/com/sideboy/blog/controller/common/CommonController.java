package com.sideboy.blog.controller.common;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.google.code.kaptcha.impl.DefaultKaptcha;

public class CommonController { // 参考：https://www.jianshu.com/p/a3525990cd82

	@Autowired
	private DefaultKaptcha captchaProducer;

	@GetMapping("/common/kaptcha")
	public void defaultKaptcha(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
			throws Exception {
		byte[] captchaOutputStream = null;
		ByteArrayOutputStream imgOutputStream = new ByteArrayOutputStream();
		try {
			// 生产验证码字符串并保存到session中
			String verifyCode = captchaProducer.createText();
			httpServletRequest.getSession().setAttribute("verifyCode", verifyCode);
			BufferedImage challenge = captchaProducer.createImage(verifyCode);
			ImageIO.write(challenge, "jpg", imgOutputStream);
		} catch (IllegalArgumentException e) {
			httpServletResponse.sendError(HttpServletResponse.SC_NOT_FOUND);
			return;
		}
		captchaOutputStream = imgOutputStream.toByteArray();
		httpServletResponse.setHeader("Cache-Control", "no-store");
		httpServletResponse.setHeader("Pragma", "no-cache");
		httpServletResponse.setDateHeader("Expires", 0);
		httpServletResponse.setContentType("image/jpeg");
		ServletOutputStream responseOutputStream = httpServletResponse.getOutputStream();
		responseOutputStream.write(captchaOutputStream);
		responseOutputStream.flush();
		responseOutputStream.close();
	}
}
