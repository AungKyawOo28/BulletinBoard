package scm.bulletinboard.api.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

@Component
public class AuthenticationInterceptor {
	/**
	 * <h2>preHandle</h2>
	 * <p>
	 * TODO preHandle
	 * </p>
	 * 
	 * @param request
	 * @param response
	 * @param handler
	 * @return boolean
	 * @throws Exception
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		if (request.getSession().getAttribute("LOGIN_USER") == null) {
			return false;
		} else {
			return true;
		}
	}

}
