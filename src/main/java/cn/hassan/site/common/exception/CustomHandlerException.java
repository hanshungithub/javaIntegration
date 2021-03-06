package cn.hassan.site.common.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/**
 * Created with idea
 * Author: hss
 * Date: 2019/2/22 9:13
 * Description:
 */
public class CustomHandlerException implements HandlerExceptionResolver {

	public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
		//定义异常信息
		String msg;

		//判断异常类型
		if (e instanceof BaseException) {
			msg = e.getMessage();
		}else{
			Writer out = new StringWriter();
			PrintWriter printWriter = new PrintWriter(out);
			e.printStackTrace(printWriter);
			msg = out.toString();
		}
		//在这里还可以做其他的操作。比如发送错误日志给特定的人员

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("msg", msg);
		modelAndView.setViewName("error");
		return modelAndView;
	}
}

