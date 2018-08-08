package lti.hola.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lti.hola.bean.RegisterBean;
import lti.hola.service.UserService;

public class UserControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService service;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String referer = request.getHeader("referer");
		//Getting session from request - If session id exist in request header 
		//old session object retured otherwise fresh session created
		HttpSession session = request.getSession();
		
		if (referer.contains("home.jsp")) {
			// Request coming from home for login authentication
			RegisterBean user = LoginController.authenticate(request);
			if (user != null) {
				// login successful
				session.setAttribute("User", user);
				response.sendRedirect("profile.jsp");
			} else {
				// Login failed
				response.sendRedirect("home.jsp?invalid=yes");
			}

		} else if (referer.contains("register.jsp")) {
			// Request coming for validating user for password change
			if (RegisterController.registration(request))
				response.sendRedirect("home.jsp");
			else
				response.sendRedirect("register.jsp");
		} else if (referer.contains("forget.jsp")) {
			if (LoginController.forgetPassword(request))
				response.sendRedirect("change.jsp");
			else
				response.sendRedirect("forget.jsp?invalid=yes");
		} else if (referer.contains("change.jsp")) {
			// Request coming for updating password
			if (LoginController.changePassword(request))
				response.sendRedirect("home.jsp");
			else
				response.sendRedirect("change.jsp");
		}else {
			//Request coming for logout - destroying session
			session.invalidate();
			response.sendRedirect("home.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
