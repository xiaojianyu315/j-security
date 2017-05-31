package org.jsecurity.interceptor;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoggerInterceptor extends HandlerInterceptorAdapter {
	static Logger logger = Logger.getLogger(LoggerInterceptor.class) ;
	static{
		BasicConfigurator.configure() ;
	}
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
			System.out.println("------------------------Spring Request-------------------------------------");
			System.out.println("请求方法为---：" + request.getRequestURI()) ;
			System.out.println("请求参数为---：" + request.getParameterMap().toString());
			System.out.println("---------------------------------------------------------------------------");
		return super.preHandle(request, response, handler);
	}
	
	@Override
	public void postHandle(HttpServletRequest request,HttpServletResponse response,Object handler,ModelAndView modelAndView) throws Exception{
		logger.info("--------请求后") ;
		super.postHandle(request, response, handler, modelAndView);
 	}
	
	@Override
	public void afterCompletion(HttpServletRequest request,HttpServletResponse response,Object handler,Exception ex) throws Exception{
		//logger.info("-------显示视图后被调用") ;
		super.afterCompletion(request, response, handler, ex) ;
	}
}
