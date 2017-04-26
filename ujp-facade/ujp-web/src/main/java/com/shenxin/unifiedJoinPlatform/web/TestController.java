package com.shenxin.unifiedJoinPlatform.web;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.shenxin.unifiedJoinPlatform.utils.DateUtil;

@Controller
@RequestMapping("test")
public class TestController extends AbstractController{

	@RequestMapping("/test")
	public String test() {
		System.out.println(DateUtil.getWebTodayString());
		return "test";
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Map<?, ?> parameters = request.getParameterMap();
		return null;
	}
}
