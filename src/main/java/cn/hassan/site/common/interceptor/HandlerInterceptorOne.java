package cn.hassan.site.common.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HandlerInterceptorOne implements HandlerInterceptor {

	/**
	 * Controller执行前调用此方法,返回true表示继续执行，返回false中止执行,这里可以加入登录校验、权限拦截等
	 */
	public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
		System.out.println("HandlerInterceptor1....preHandle");
		return true;
	}

	/**
	 * controller执行后但未返回视图前调用此方法，这里可在返回用户前对模型数据进行加工处理，比如这里加入公用信息以便页面显示
	 */
	public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
		System.out.println("HandlerInterceptor1....postHandle");
	}

	/**
	 * controller执行后且视图返回后调用此方法,这里可得到执行controller时的异常信息,这里可记录操作日志
	 */
	public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
		System.out.println("HandlerInterceptor1....afterCompletion");
	}
}
