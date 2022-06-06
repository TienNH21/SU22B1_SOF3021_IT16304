package su22.sof3021.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class DemoLogInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(
		HttpServletRequest req,
		HttpServletResponse res,
		Object handler
	) {
		System.out.println("DemoLogInterceptor - preHandle");
		return true;
	}
	
	@Override
	public void postHandle(
		HttpServletRequest req,
		HttpServletResponse res,
		Object handler,
		ModelAndView modelNView
	) {
		System.out.println("DemoLogInterceptor - postHandle");
	}

	
	@Override
	public void afterCompletion(
		HttpServletRequest req,
		HttpServletResponse res,
		Object handler,
		Exception e
	) {
		System.out.println("DemoLogInterceptor - afterCompletion");
		
		if (e instanceof NullPointerException) {
			// Chuyển hướng về page 500
		} else if (e instanceof IndexOutOfBoundsException) {
			// Do something ...
		}
	}
}
