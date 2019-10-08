package com.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.Manager;

public class LoginInterceptor implements HandlerInterceptor{

	/**
	 * µÇÂ¼À¹½ØÆ÷
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Manager fl = (Manager)request.getSession().getAttribute("login");
		if(fl!=null) { 
			return true;
		}else {
			response.sendRedirect("/drug/index.jsp");
			//request.getRequestDispatcher("/index.jsp").forward(request, response);
			return false;
		}
		
	}


	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
	}


	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}
		
}
