package com.winsoft;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
@WebFilter("/Login")
public class AuthenticationFilter extends HttpFilter implements Filter {
    
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest httpServletRequest = (HttpServletRequest)request;
		HttpServletResponse httpServletResponse = (HttpServletResponse)response;
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if (username.equals("saksham") && password.equals("1234")) {
			HttpSession httpSession = httpServletRequest.getSession();
			httpSession.setAttribute("username", username);
			
			chain.doFilter(request, response);
		}
		else {
			httpServletResponse.sendRedirect("login.jsp");
		}
	}

}
